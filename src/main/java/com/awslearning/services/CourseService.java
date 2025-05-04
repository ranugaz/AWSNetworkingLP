package com.awslearning.services;

import com.awslearning.models.Course;
import com.awslearning.repositories.CourseRepository;
import com.awslearning.exceptions.CourseNotFoundException;
import com.awslearning.exceptions.ValidationException;
import java.util.List;

public class CourseService {
    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public Course createCourse(Course course) {
        validateCourse(course);
        courseRepository.save(course);
        return course;
    }

    public Course getCourse(String courseId) {
        return courseRepository.findById(courseId)
                .orElseThrow(() -> new CourseNotFoundException(courseId));
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Course updateCourse(String courseId, Course course) {
        if (!courseRepository.exists(courseId)) {
            throw new CourseNotFoundException(courseId);
        }
        validateCourse(course);
        course.setCourseId(courseId);
        courseRepository.save(course);
        return course;
    }

    public void deleteCourse(String courseId) {
        if (!courseRepository.exists(courseId)) {
            throw new CourseNotFoundException(courseId);
        }
        courseRepository.delete(courseId);
    }

    public List<Course> getCoursesByInstructor(String instructorId) {
        return courseRepository.findByInstructorId(instructorId);
    }

    private void validateCourse(Course course) {
        if (course.getTitle() == null || course.getTitle().trim().isEmpty()) {
            throw new ValidationException("title", "Course title cannot be empty");
        }
        if (course.getDescription() == null || course.getDescription().trim().isEmpty()) {
            throw new ValidationException("description", "Course description cannot be empty");
        }
    }
}