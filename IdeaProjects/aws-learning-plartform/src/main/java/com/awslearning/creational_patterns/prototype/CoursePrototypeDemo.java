// CoursePrototypeDemo.java
package com.awslearning.creational_patterns.prototype;

public class CoursePrototypeDemo {
    public static void main(String[] args) {
        CourseTemplateRegistry registry = new CourseTemplateRegistry();

        // Clone and customize first course
        CourseTemplate course1 = registry.getTemplate("networking");
        course1.customize("NET101", "John Doe");
        System.out.println("First course: " + course1);

        // Clone and customize second course
        CourseTemplate course2 = registry.getTemplate("networking");
        course2.customize("NET102", "Jane Smith");
        System.out.println("Second course: " + course2);
    }
}