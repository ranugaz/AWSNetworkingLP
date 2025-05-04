package com.awslearning.creational_patterns.simple_factory;

import com.awslearning.enums.ContentType;
import com.awslearning.models.Content;

public class ContentFactoryDemo {
    public static void main(String[] args) {
        // Create PDF content
        Content pdfContent = ContentFactory.createContent("PDF001", ContentType.PDF, "application/pdf");
        System.out.println("Created PDF content with ID: " + pdfContent.getContentId());

        // Create Video content
        Content videoContent = ContentFactory.createContent("VID001", ContentType.VIDEO, "video/mp4");
        System.out.println("Created Video content with ID: " + videoContent.getContentId());
    }
}