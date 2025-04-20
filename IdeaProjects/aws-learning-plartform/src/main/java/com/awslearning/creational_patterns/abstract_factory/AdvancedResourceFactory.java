package com.awslearning.creational_patterns.abstract_factory;

public class AdvancedResourceFactory implements LearningResourceFactory {
    @Override
    public LearningContent createContent() {
        return new AdvancedContent();
    }

    @Override
    public Assessment createAssessment() {
        return new AdvancedAssessment();
    }
}