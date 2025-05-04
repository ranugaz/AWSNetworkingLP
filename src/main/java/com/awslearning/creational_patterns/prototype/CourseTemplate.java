// CourseTemplate.java
package com.awslearning.creational_patterns.prototype;

public interface CourseTemplate extends Cloneable {
    CourseTemplate clone();
    void customize(String courseId, String instructorName);
}