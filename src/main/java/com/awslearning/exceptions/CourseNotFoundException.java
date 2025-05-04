package com.awslearning.exceptions;

public class CourseNotFoundException extends RuntimeException {
    public CourseNotFoundException(String courseId) {
        super("Course not found with ID: " + courseId);
    }
}