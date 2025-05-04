// Question.java
package com.awslearning.models;

import java.util.List;
import java.util.ArrayList;

public class Question {
    private String questionId;
    private String text;
    private String type;
    private List<String> options;
    private String correctAnswer;

    // Constructor
    public Question(String questionId, String text, String type) {
        this.questionId = questionId;
        this.text = text;
        this.type = type;
        this.options = new ArrayList<>();
    }

    // Getters and Setters
    public String getQuestionId() {
        return questionId;
    }

    public String getText() {
        return text;
    }

    // Methods
    public boolean validate() {
        // Implementation for validating question
        return true;
    }

    public boolean grade(String answer) {
        // Implementation for grading question
        return answer.equals(correctAnswer);
    }
}