package com.awslearning.creational_patterns.factory_method;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuizFactoryTest {

    @Test
    public void testCreateMultipleChoiceQuiz() {
        // Arrange
        QuizFactory factory = new MultipleChoiceQuizFactory();

        // Act
        Quiz quiz = factory.createQuiz("MC001", "AWS Networking Basics");

        // Assert
        assertNotNull(quiz);
        assertTrue(quiz instanceof MultipleChoiceQuiz);

        // Test quiz functionality
        quiz.setQuestion("What is VPC?");
        quiz.submitAnswer("Virtual Private Cloud");
        assertTrue(quiz.grade());
    }

    @Test
    public void testCreatePracticalQuiz() {
        // Arrange
        QuizFactory factory = new PracticalQuizFactory();

        // Act
        Quiz quiz = factory.createQuiz("PR001", "VPC Setup");

        // Assert
        assertNotNull(quiz);
        assertTrue(quiz instanceof PracticalQuiz);

        // Test quiz functionality
        quiz.setQuestion("Create a VPC with two subnets");
        quiz.submitAnswer("Steps to create VPC...");
        assertTrue(quiz.grade());
    }

    @Test
    public void testDifferentQuizTypes() {
        // Arrange
        QuizFactory mcFactory = new MultipleChoiceQuizFactory();
        QuizFactory practicalFactory = new PracticalQuizFactory();

        // Act
        Quiz mcQuiz = mcFactory.createQuiz("MC002", "Basic Concepts");
        Quiz practicalQuiz = practicalFactory.createQuiz("PR002", "Implementation");

        // Assert
        assertNotNull(mcQuiz);
        assertNotNull(practicalQuiz);
        assertNotEquals(mcQuiz.getClass(), practicalQuiz.getClass());
    }
}