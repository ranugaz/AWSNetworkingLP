package com.awslearning.creational_patterns.factory_method;

public class PracticalQuizFactory extends QuizFactory {
    @Override
    public Quiz createQuiz(String quizId, String title) {
        return new PracticalQuiz(quizId, title);
    }
}