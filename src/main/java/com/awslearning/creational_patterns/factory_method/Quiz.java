package com.awslearning.creational_patterns.factory_method;

public interface Quiz {
    void setQuestion(String question);
    void submitAnswer(String answer);
    boolean grade();
}