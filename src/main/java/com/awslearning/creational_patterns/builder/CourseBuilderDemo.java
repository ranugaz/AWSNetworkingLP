// CourseBuilderDemo.java
package com.awslearning.creational_patterns.builder;

public class CourseBuilderDemo {
    public static void main(String[] args) {
        Course awsCourse = new Course.CourseBuilder("AWS101", "AWS Networking Fundamentals")
                .description("Learn AWS networking from scratch")
                .addModule("VPC Basics")
                .addModule("Subnets and Routing")
                .addModule("Security Groups")
                .addPrerequisite("Basic Networking Knowledge")
                .duration(40)
                .difficulty("Intermediate")
                .withCertification()
                .withPracticalAssignments()
                .build();

        System.out.println("Created course: " + awsCourse);
    }
}