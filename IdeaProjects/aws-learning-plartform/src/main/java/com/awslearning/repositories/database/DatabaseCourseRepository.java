package com.awslearning.repositories.database;

import com.awslearning.models.Course;
import com.awslearning.repositories.CourseRepository;
import java.util.List;
import java.util.Optional;

public class DatabaseCourseRepository implements CourseRepository {
    private String connectionString;

    public DatabaseCourseRepository(String connectionString) {
        this.connectionString = connectionString;
        // TODO: Initialize database connection
    }

    @Override
    public void save(Course entity) {
        // TODO: Implement SQL INSERT/UPDATE
        throw new UnsupportedOperationException("Database implementation coming soon");
    }

    @Override
    public Optional<Course> findById(String id) {
        // TODO: Implement SQL SELECT by ID
        throw new UnsupportedOperationException("Database implementation coming soon");
    }

    @Override
    public List<Course> findAll() {
        // TODO: Implement SQL SELECT ALL
        throw new UnsupportedOperationException("Database implementation coming soon");
    }

    @Override
    public void delete(String id) {
        // TODO: Implement SQL DELETE
        throw new UnsupportedOperationException("Database implementation coming soon");
    }

    @Override
    public boolean exists(String id) {
        // TODO: Implement SQL EXISTS check
        throw new UnsupportedOperationException("Database implementation coming soon");
    }

    @Override
    public List<Course> findByInstructorId(String instructorId) {
        // TODO: Implement SQL SELECT by instructor_id
        throw new UnsupportedOperationException("Database implementation coming soon");
    }

    @Override
    public List<Course> findByDifficulty(String difficulty) {
        // TODO: Implement SQL SELECT by difficulty
        throw new UnsupportedOperationException("Database implementation coming soon");
    }
}