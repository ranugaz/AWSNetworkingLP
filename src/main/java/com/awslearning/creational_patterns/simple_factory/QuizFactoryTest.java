package com.awslearning.creational_patterns.factory_method;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuizFactoryTest {

    @Test
    public void testCreateMultipleChoiceQuiz() {
        QuizFactory factory = new MultipleChoiceQuizFactory();
        Quiz quiz = factory.createQuiz("MC001", "AWS Basics");

        assertNotNull(quiz);
        assertTrue(quiz instanceof MultipleChoiceQuiz);
    }

    @Test
    public void testCreatePracticalQuiz() {
        QuizFactory factory = new PracticalQuizFactory();
        Quiz quiz = factory.createQuiz("PR001", "VPC Setup");

        assertNotNull(quiz);
        assertTrue(quiz instanceof PracticalQuiz);
    }
}