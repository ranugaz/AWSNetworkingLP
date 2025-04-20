package com.awslearning.creational_patterns.abstract_factory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LearningResourceFactoryTest {

    @Test
    public void testBasicResourceFactory() {
        // Arrange
        LearningResourceFactory factory = new BasicResourceFactory();

        // Act
        LearningContent content = factory.createContent();
        Assessment assessment = factory.createAssessment();

        // Assert
        assertNotNull(content);
        assertNotNull(assessment);
        assertTrue(content instanceof BasicContent);
        assertTrue(assessment instanceof BasicAssessment);
    }

    @Test
    public void testAdvancedResourceFactory() {
        // Arrange
        LearningResourceFactory factory = new AdvancedResourceFactory();

        // Act
        LearningContent content = factory.createContent();
        Assessment assessment = factory.createAssessment();

        // Assert
        assertNotNull(content);
        assertNotNull(assessment);
        assertTrue(content instanceof AdvancedContent);
        assertTrue(assessment instanceof AdvancedAssessment);
    }

    @Test
    public void testResourceCompatibility() {
        // Arrange
        LearningResourceFactory basicFactory = new BasicResourceFactory();
        LearningResourceFactory advancedFactory = new AdvancedResourceFactory();

        // Act
        LearningContent basicContent = basicFactory.createContent();
        Assessment basicAssessment = basicFactory.createAssessment();
        LearningContent advancedContent = advancedFactory.createContent();
        Assessment advancedAssessment = advancedFactory.createAssessment();

        // Assert
        assertTrue(basicContent instanceof BasicContent);
        assertTrue(basicAssessment instanceof BasicAssessment);
        assertTrue(advancedContent instanceof AdvancedContent);
        assertTrue(advancedAssessment instanceof AdvancedAssessment);
    }

    @Test
    public void testContentDisplay() {
        // Arrange
        LearningResourceFactory basicFactory = new BasicResourceFactory();
        LearningResourceFactory advancedFactory = new AdvancedResourceFactory();

        // Act & Assert
        LearningContent basicContent = basicFactory.createContent();
        basicContent.display(); // Should not throw exception

        LearningContent advancedContent = advancedFactory.createContent();
        advancedContent.display(); // Should not throw exception
    }

    @Test
    public void testAssessmentConduct() {
        // Arrange
        LearningResourceFactory basicFactory = new BasicResourceFactory();
        LearningResourceFactory advancedFactory = new AdvancedResourceFactory();

        // Act & Assert
        Assessment basicAssessment = basicFactory.createAssessment();
        basicAssessment.conduct(); // Should not throw exception

        Assessment advancedAssessment = advancedFactory.createAssessment();
        advancedAssessment.conduct(); // Should not throw exception
    }
}