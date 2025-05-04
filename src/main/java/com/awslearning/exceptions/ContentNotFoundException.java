package com.awslearning.exceptions;

public class ContentNotFoundException extends RuntimeException {
    public ContentNotFoundException(String contentId) {
        super("Content not found with ID: " + contentId);
    }
}