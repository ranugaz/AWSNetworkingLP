package com.awslearning.models;

import com.awslearning.enums.ContentType;
import java.util.ArrayList;
import java.util.List;

public class Lesson {
    private String lessonId;
    private String title;
    private ContentType contentType;
    private Integer duration;
    private Integer sequence;
    private String status;
    private List<Content> contentItems;

    // Constructor
    public Lesson(String lessonId, String title, Integer sequence) {
        this.lessonId = lessonId;
        this.title = title;
        this.sequence = sequence;
        this.contentItems = new ArrayList<>();
    }

    // Getters and Setters
    public String getLessonId() {
        return lessonId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getSequence() {
        return sequence;
    }

    // Methods
    public void view() {
        // Implementation for viewing lesson
    }

    public boolean markComplete() {
        // Implementation for marking lesson as complete
        return true;
    }

    public void updateContent() {
        // Implementation for updating content
    }

    public double trackProgress() {
        // Implementation for tracking progress
        return 0.0;
    }
}