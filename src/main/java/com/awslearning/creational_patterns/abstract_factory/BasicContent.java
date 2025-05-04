package com.awslearning.creational_patterns.abstract_factory;

public class BasicContent implements LearningContent {
    @Override
    public void display() {
        System.out.println("Displaying basic AWS networking content");
    }
}