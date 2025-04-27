package com.awslearning.repositories.inmemory;

import com.awslearning.models.Course;
import com.awslearning.repositories.CourseRepository;
import java.util.*;
import java.util.stream.Collectors;

public class InMemoryCourseRepository implements CourseRepository {
    private final Map<String, Course> storage = new HashMap<>();

    @Override
    public void save(Course entity) {
        storage.put(entity.getCourseId(), entity);
    }

    @Override
    public Optional<Course> findById(String id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public List<Course> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public void delete(String id) {
        storage.remove(id);
    }

    @Override
    public boolean exists(String id) {
        return storage.containsKey(id);
    }

    @Override
    public List<Course> findByInstructorId(String instructorId) {
        return storage.values().stream()
                .filter(course -> course.getInstructorId().equals(instructorId))
                .collect(Collectors.toList());
    }

    @Override
    public List<Course> findByDifficulty(String difficulty) {
        return storage.values().stream()
                .filter(course -> course.getDifficulty().equals(difficulty))
                .collect(Collectors.toList());
    }
}