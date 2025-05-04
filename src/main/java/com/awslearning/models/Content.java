package com.awslearning.models;

import com.awslearning.enums.ContentType;

public class Content {
    private String contentId;
    private ContentType type;
    private String courseId;    // Add this field
    private byte[] data;
    private String format;
    private Integer duration;
    private String status;

    // Update constructor to include courseId
    public Content(String contentId, ContentType type, String format) {
        this.contentId = contentId;
        this.type = type;
        this.format = format;
    }

    // Add this getter method
    public String getCourseId() {
        return courseId;
    }

    // Add this setter method
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    // Existing getters
    public String getContentId() {
        return contentId;
    }

    public ContentType getType() {
        return type;
    }

    public String getFormat() {
        return format;
    }

    // Other existing methods...
}