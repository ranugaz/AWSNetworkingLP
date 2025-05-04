// Quiz.java
package com.awslearning.models;

import java.util.List;
import java.util.ArrayList;

public class Quiz {
    private String quizId;
    private String title;
    private Integer timeLimit;
    private Integer passingScore;
    private Integer attempts;
    private List<Question> questions;

    // Constructor
    public Quiz(String quizId, String title, Integer timeLimit, Integer passingScore) {
        this.quizId = quizId;
        this.title = title;
        this.timeLimit = timeLimit;
        this.passingScore = passingScore;
        this.attempts = 0;
        this.questions = new ArrayList<>();
    }

    // Getters and Setters
    public String getQuizId() {
        return quizId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Methods
    public boolean start() {
        // Implementation for starting quiz
        return true;
    }

    public boolean submit() {
        // Implementation for submitting quiz
        return true;
    }

    public int grade() {
        // Implementation for grading quiz
        return 0;
    }

    public boolean reviewAttempt() {
        // Implementation for reviewing quiz attempt
        return true;
    }

    public boolean allowRetry() {
        // Implementation for allowing retry
        return true;
    }
}