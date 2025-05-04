package com.awslearning.creational_patterns.factory_method;

public abstract class QuizFactory {
    public abstract Quiz createQuiz(String quizId, String title);
}