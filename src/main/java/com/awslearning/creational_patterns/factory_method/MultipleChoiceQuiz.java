package com.awslearning.creational_patterns.factory_method;

public class MultipleChoiceQuiz implements Quiz {
    private String quizId;
    private String title;
    private String question;
    private String answer;

    public MultipleChoiceQuiz(String quizId, String title) {
        this.quizId = quizId;
        this.title = title;
    }

    @Override
    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public void submitAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public boolean grade() {
        // Implementation for multiple choice grading
        return true;
    }
}