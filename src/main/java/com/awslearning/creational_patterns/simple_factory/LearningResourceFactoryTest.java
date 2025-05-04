package com.awslearning.creational_patterns.abstract_factory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LearningResourceFactoryTest {

    @Test
    public void testBasicResourceFactory() {
        LearningResourceFactory factory = new BasicResourceFactory();

        LearningContent content = factory.createContent();
        Assessment assessment = factory.createAssessment();

        assertNotNull(content);
        assertNotNull(assessment);
        assertTrue(content instanceof BasicContent);
        assertTrue(assessment instanceof BasicAssessment);
    }

    @Test
    public void testAdvancedResourceFactory() {
        LearningResourceFactory factory = new AdvancedResourceFactory();

        LearningContent content = factory.createContent();
        Assessment assessment = factory.createAssessment();

        assertNotNull(content);
        assertNotNull(assessment);
        assertTrue(content instanceof AdvancedContent);
        assertTrue(assessment instanceof AdvancedAssessment);
    }
}