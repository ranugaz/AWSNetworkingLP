package com.awslearning;

import com.awslearning.enums.UserRole;
import com.awslearning.enums.ContentType;
import com.awslearning.models.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting AWS Learning Platform Test...\n");

        try {
            // Test 1: User Creation
            System.out.println("Test 1: Creating User...");
            User student = new User("U001", "student@example.com", "John Doe", UserRole.STUDENT);
            System.out.println("Created user: " + student.getName() + " with role: " + student.getRole());
            System.out.println("User Test Passed!\n");

            // Test 2: Course Creation
            System.out.println("Test 2: Creating Course...");
            Course course = new Course("C001", "AWS Networking Basics", "Introduction to AWS Networking");
            System.out.println("Created course: " + course.getTitle());
            System.out.println("Course Test Passed!\n");

            // Test 3: Lesson Creation
            System.out.println("Test 3: Creating Lesson...");
            Lesson lesson = new Lesson("L001", "VPC Fundamentals", 1);
            System.out.println("Created lesson: " + lesson.getTitle());
            System.out.println("Lesson Test Passed!\n");

            // Test 4: Content Creation
            System.out.println("Test 4: Creating Content...");
            Content content = new Content("CT001", ContentType.PDF, "application/pdf");
            System.out.println("Created content with type: " + content.getType());
            System.out.println("Content Test Passed!\n");

            // Test 5: Course Enrollment
            System.out.println("Test 5: Testing Course Enrollment...");
            boolean enrolled = student.enrollInCourse("C001");
            System.out.println("Enrollment status: " + enrolled);
            System.out.println("Enrollment Test Passed!\n");

            System.out.println("All tests completed successfully!");

        } catch (Exception e) {
            System.out.println("An error occurred during testing: " + e.getMessage());
            e.printStackTrace();
        }
    }
}