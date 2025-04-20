package com.awslearning.creational_patterns.abstract_factory;

public class BasicAssessment implements Assessment {
    @Override
    public void conduct() {
        System.out.println("Conducting basic level assessment");
    }
}