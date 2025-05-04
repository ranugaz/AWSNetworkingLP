package com.awslearning.repositories.inmemory;

import com.awslearning.models.Course;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;

public class InMemoryCourseRepositoryTest {
    private InMemoryCourseRepository repository;
    private Course testCourse;

    @BeforeEach
    void setUp() {
        repository = new InMemoryCourseRepository();
        testCourse = new Course("C001", "Test Course", "Test Description");
    }

    @Test
    void testSave() {
        repository.save(testCourse);
        Optional<Course> found = repository.findById("C001");
        assertTrue(found.isPresent());
        assertEquals(testCourse.getTitle(), found.get().getTitle());
    }

    @Test
    void testDelete() {
        repository.save(testCourse);
        repository.delete("C001");
        Optional<Course> found = repository.findById("C001");
        assertFalse(found.isPresent());
    }

    @Test
    void testFindAll() {
        repository.save(testCourse);
        repository.save(new Course("C002", "Another Course", "Description"));
        assertEquals(2, repository.findAll().size());
    }
}