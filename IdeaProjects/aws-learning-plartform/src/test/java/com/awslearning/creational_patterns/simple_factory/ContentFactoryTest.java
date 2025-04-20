package com.awslearning.creational_patterns.simple_factory;

import com.awslearning.enums.ContentType;
import com.awslearning.models.Content;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContentFactoryTest {

    @Test
    public void testCreatePDFContent() {
        Content content = ContentFactory.createContent("PDF001", ContentType.PDF, "application/pdf");
        assertNotNull(content);
        assertEquals("PDF001", content.getContentId());
        assertEquals(ContentType.PDF, content.getType());
    }

    @Test
    public void testCreateVideoContent() {
        Content content = ContentFactory.createContent("VID001", ContentType.VIDEO, "video/mp4");
        assertNotNull(content);
        assertEquals("VID001", content.getContentId());
        assertEquals(ContentType.VIDEO, content.getType());
    }

    @Test
    public void testCreateTextContent() {
        Content content = ContentFactory.createContent("TXT001", ContentType.TEXT, "text/plain");
        assertNotNull(content);
        assertEquals("TXT001", content.getContentId());
        assertEquals(ContentType.TEXT, content.getType());
    }
}