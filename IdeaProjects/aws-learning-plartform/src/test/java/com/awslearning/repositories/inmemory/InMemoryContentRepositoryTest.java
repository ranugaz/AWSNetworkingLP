package com.awslearning.repositories.inmemory;

import com.awslearning.models.Content;
import com.awslearning.enums.ContentType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;

public class InMemoryContentRepositoryTest {
    private InMemoryContentRepository repository;
    private Content testContent;

    @BeforeEach
    void setUp() {
        repository = new InMemoryContentRepository();
        testContent = new Content("CT001", ContentType.PDF, "application/pdf");
        testContent.setCourseId("C001");
    }

    @Test
    void testSave() {
        repository.save(testContent);
        Optional<Content> found = repository.findById("CT001");
        assertTrue(found.isPresent());
        assertEquals(testContent.getType(), found.get().getType());
    }

    @Test
    void testFindByType() {
        repository.save(testContent);
        List<Content> pdfContents = repository.findByType(ContentType.PDF);
        assertEquals(1, pdfContents.size());
        assertEquals(testContent.getContentId(), pdfContents.get(0).getContentId());
    }

    @Test
    void testFindByCourseId() {
        repository.save(testContent);
        List<Content> courseContents = repository.findByCourseId("C001");
        assertEquals(1, courseContents.size());
        assertEquals(testContent.getContentId(), courseContents.get(0).getContentId());
    }

    @Test
    void testDelete() {
        repository.save(testContent);
        repository.delete("CT001");
        assertFalse(repository.exists("CT001"));
    }

    @Test
    void testFindAll() {
        repository.save(testContent);
        Content anotherContent = new Content("CT002", ContentType.VIDEO, "video/mp4");
        anotherContent.setCourseId("C001");
        repository.save(anotherContent);

        List<Content> allContents = repository.findAll();
        assertEquals(2, allContents.size());
    }
}