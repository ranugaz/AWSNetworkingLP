package com.awslearning.repositories.inmemory;

import com.awslearning.models.Content;
import com.awslearning.repositories.ContentRepository;
import com.awslearning.enums.ContentType;
import java.util.*;
import java.util.stream.Collectors;

public class InMemoryContentRepository implements ContentRepository {
    private final Map<String, Content> storage = new HashMap<>();

    @Override
    public void save(Content entity) {
        storage.put(entity.getContentId(), entity);
    }

    @Override
    public Optional<Content> findById(String id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public List<Content> findAll() {
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
    public List<Content> findByType(ContentType type) {
        return storage.values().stream()
                .filter(content -> content.getType().equals(type))
                .collect(Collectors.toList());
    }

    @Override
    public List<Content> findByCourseId(String courseId) {
        return storage.values().stream()
                .filter(content -> content.getCourseId().equals(courseId))
                .collect(Collectors.toList());
    }
}