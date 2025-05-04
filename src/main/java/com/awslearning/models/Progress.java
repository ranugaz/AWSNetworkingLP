// Progress.java
package com.awslearning.models;

import java.util.Date;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Progress {
    private String progressId;
    private String userId;
    private String courseId;
    private List<String> completedLessons;
    private Map<String, Integer> quizScores;
    private Date lastAccessed;

    // Constructor
    public Progress(String progressId, String userId, String courseId) {
        this.progressId = progressId;
        this.userId = userId;
        this.courseId = courseId;
        this.completedLessons = new ArrayList<>();
        this.quizScores = new HashMap<>();
        this.lastAccessed = new Date();
    }

    // Getters and Setters
    public String getProgressId() {
        return progressId;
    }

    // Methods
    public void updateProgress() {
        this.lastAccessed = new Date();
    }

    public double calculateCompletion() {
        // Implementation for calculating completion percentage
        return 0.0;
    }

    public void generateReport() {
        // Implementation for generating progress report
    }

    public void trackQuizScore(String quizId, int score) {
        quizScores.put(quizId, score);
    }
}