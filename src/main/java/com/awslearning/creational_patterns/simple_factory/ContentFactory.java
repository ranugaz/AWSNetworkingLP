package com.awslearning.creational_patterns.simple_factory;

import com.awslearning.enums.ContentType;
import com.awslearning.models.Content;

public class ContentFactory {
    public static Content createContent(String contentId, ContentType type, String format) {
        return new Content(contentId, type, format);
    }
}