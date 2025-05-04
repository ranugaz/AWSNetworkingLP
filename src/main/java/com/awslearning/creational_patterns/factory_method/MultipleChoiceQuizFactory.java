package com.awslearning.creational_patterns.factory_method;

public class MultipleChoiceQuizFactory extends QuizFactory {
    @Override
    public Quiz createQuiz(String quizId, String title) {
        return new MultipleChoiceQuiz(quizId, title);
    }
}