// NetworkingCourseTemplate.java
package com.awslearning.creational_patterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class NetworkingCourseTemplate implements CourseTemplate {
    private String courseId;
    private String title;
    private String instructorName;
    private List<String> modules;
    private List<String> assignments;

    public NetworkingCourseTemplate() {
        this.modules = new ArrayList<>();
        this.assignments = new ArrayList<>();
        // Default template setup
        setupDefaultTemplate();
    }

    private void setupDefaultTemplate() {
        this.title = "AWS Networking Course";
        modules.add("VPC Fundamentals");
        modules.add("Subnet Configuration");
        modules.add("Security Groups");
        assignments.add("Create VPC");
        assignments.add("Configure Routing");
    }

    @Override
    public CourseTemplate clone() {
        NetworkingCourseTemplate clone = new NetworkingCourseTemplate();
        clone.courseId = this.courseId;
        clone.title = this.title;
        clone.instructorName = this.instructorName;
        clone.modules = new ArrayList<>(this.modules);
        clone.assignments = new ArrayList<>(this.assignments);
        return clone;
    }

    @Override
    public void customize(String courseId, String instructorName) {
        this.courseId = courseId;
        this.instructorName = instructorName;
    }

    @Override
    public String toString() {
        return "NetworkingCourseTemplate{" +
                "courseId='" + courseId + '\'' +
                ", title='" + title + '\'' +
                ", instructor='" + instructorName + '\'' +
                ", modules=" + modules +
                ", assignments=" + assignments +
                '}';
    }
}