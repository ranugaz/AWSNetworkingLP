package com.awslearning.creational_patterns.builder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CourseBuilderTest {

    @Test
    public void testBasicCourseCreation() {
        Course course = new Course.CourseBuilder("AWS101", "AWS Networking Fundamentals")
                .description("Learn AWS networking from scratch")
                .build();

        assertNotNull(course);
        assertEquals("AWS101", course.getCourseId());
        assertEquals("AWS Networking Fundamentals", course.getTitle());
    }

    @Test
    public void testFullCourseCreation() {
        Course course = new Course.CourseBuilder("AWS102", "Advanced AWS Networking")
                .description("Advanced networking concepts")
                .addModule("VPC Design")
                .addModule("Hybrid Connectivity")
                .addPrerequisite("Basic Networking")
                .duration(40)
                .difficulty("Advanced")
                .withCertification()
                .withPracticalAssignments()
                .build();

        assertNotNull(course);
        assertTrue(course.hasCertification());
        assertEquals(2, course.getModules().size());
    }

    @Test
    public void testCourseWithoutOptionalFields() {
        Course course = new Course.CourseBuilder("AWS103", "AWS Security")
                .build();

        assertNotNull(course);
        assertEquals("AWS103", course.getCourseId());
        assertFalse(course.hasCertification());
    }
}