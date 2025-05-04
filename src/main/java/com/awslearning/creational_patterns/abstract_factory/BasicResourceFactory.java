package com.awslearning.creational_patterns.abstract_factory;

public class BasicResourceFactory implements LearningResourceFactory {
    @Override
    public LearningContent createContent() {
        return new BasicContent();
    }

    @Override
    public Assessment createAssessment() {
        return new BasicAssessment();
    }
}