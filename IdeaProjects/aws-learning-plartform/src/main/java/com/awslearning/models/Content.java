package com.awslearning.models;

import com.awslearning.enums.ContentType;

public class Content {
    private String contentId;
    private ContentType type;
    private byte[] data;
    private String format;
    private Integer duration;
    private String status;

    // Constructor
    public Content(String contentId, ContentType type, String format) {
        this.contentId = contentId;
        this.type = type;
        this.format = format;
    }

    // Getters and Setters
    public String getContentId() {
        return contentId;
    }

    public ContentType getType() {
        return type;
    }

    public String getFormat() {
        return format;
    }

    // Methods
    public boolean upload() {
        return true;
    }

    public boolean validate() {
        return true;
    }

    public boolean serve() {
        return true;
    }

    public boolean archive() {
        return true;
    }

    public boolean update() {
        return true;
    }
}