package com.awslearning.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Course {
    private String courseId;
    private String title;
    private String description;
    private String instructorId;
    private String difficulty;
    private List<String> modules;
    private Date creationDate;
    private Date lastUpdated;

    // Constructor
    public Course(String courseId, String title, String description) {
        this.courseId = courseId;
        this.title = title;
        this.description = description;
        this.modules = new ArrayList<>();
        this.creationDate = new Date();
        this.lastUpdated = new Date();
    }

    // Getters and Setters
    public String getCourseId() {
        return courseId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(String instructorId) {
        this.instructorId = instructorId;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public List<String> getModules() {
        return modules;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }
}