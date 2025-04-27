package com.awslearning.repositories;

import com.awslearning.models.Course;
import java.util.List;

public interface CourseRepository extends Repository<Course, String> {
    // Additional course-specific methods
    List<Course> findByInstructorId(String instructorId);
    List<Course> findByDifficulty(String difficulty);
}