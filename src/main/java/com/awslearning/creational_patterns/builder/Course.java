// Course.java
package com.awslearning.creational_patterns.builder;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseId;
    private String title;
    private String description;
    private List<String> modules;
    private List<String> prerequisites;
    private int durationHours;
    private String difficulty;
    private boolean hasCertification;
    private boolean hasLiveSupport;
    private boolean hasPracticalAssignments;

    // Private constructor - courses can only be created through builder
    private Course() {
        modules = new ArrayList<>();
        prerequisites = new ArrayList<>();
    }

    // Getters
    public String getCourseId() { return courseId; }
    public String getTitle() { return title; }
    public List<String> getModules() { return modules; }
    public boolean hasCertification() { return hasCertification; }

    // Static builder class
    public static class CourseBuilder {
        private Course course;

        public CourseBuilder(String courseId, String title) {
            course = new Course();
            course.courseId = courseId;
            course.title = title;
        }

        public CourseBuilder description(String description) {
            course.description = description;
            return this;
        }

        public CourseBuilder addModule(String module) {
            course.modules.add(module);
            return this;
        }

        public CourseBuilder addPrerequisite(String prerequisite) {
            course.prerequisites.add(prerequisite);
            return this;
        }

        public CourseBuilder duration(int hours) {
            course.durationHours = hours;
            return this;
        }

        public CourseBuilder difficulty(String difficulty) {
            course.difficulty = difficulty;
            return this;
        }

        public CourseBuilder withCertification() {
            course.hasCertification = true;
            return this;
        }

        public CourseBuilder withLiveSupport() {
            course.hasLiveSupport = true;
            return this;
        }

        public CourseBuilder withPracticalAssignments() {
            course.hasPracticalAssignments = true;
            return this;
        }

        public Course build() {
            return course;
        }
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", title='" + title + '\'' +
                ", modules=" + modules +
                ", certification=" + hasCertification +
                '}';
    }
}