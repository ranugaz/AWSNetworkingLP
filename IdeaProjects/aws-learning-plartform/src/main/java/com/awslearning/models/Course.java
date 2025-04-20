// Course.java
package com.awslearning.models;

import com.awslearning.enums.CourseStatus;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Course {
    private String courseId;
    private String title;
    private String description;
    private String level;
    private CourseStatus status;
    private Date creationDate;
    private Date lastUpdated;
    private List<Lesson> lessons;

    // Constructor
    public Course(String courseId, String title, String description) {
        this.courseId = courseId;
        this.title = title;
        this.description = description;
        this.status = CourseStatus.DRAFT;
        this.creationDate = new Date();
        this.lastUpdated = new Date();
        this.lessons = new ArrayList<>();
    }

    // Getters and Setters
    public String getCourseId() {
        return courseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CourseStatus getStatus() {
        return status;
    }

    // Methods
    public boolean publish() {
        this.status = CourseStatus.PUBLISHED;
        this.lastUpdated = new Date();
        return true;
    }

    public boolean addLesson(Lesson lesson) {
        return lessons.add(lesson);
    }

    public void updateContent() {
        this.lastUpdated = new Date();
    }

    public double calculateProgress(String userId) {
        // Implementation for calculating progress
        return 0.0;
    }
}