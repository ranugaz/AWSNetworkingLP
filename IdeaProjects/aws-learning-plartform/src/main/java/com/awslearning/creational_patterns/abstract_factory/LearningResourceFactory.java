package com.awslearning.creational_patterns.abstract_factory;

public interface LearningResourceFactory {
    LearningContent createContent();
    Assessment createAssessment();
}