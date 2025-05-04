package com.awslearning.repositories.inmemory;

import com.awslearning.models.User;
import com.awslearning.repositories.UserRepository;
import com.awslearning.enums.UserRole;
import java.util.*;
import java.util.stream.Collectors;

public class InMemoryUserRepository implements UserRepository {
    private final Map<String, User> storage = new HashMap<>();

    @Override
    public void save(User entity) {
        storage.put(entity.getUserId(), entity);
    }

    @Override
    public Optional<User> findById(String id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public List<User> findAll() {
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
    public Optional<User> findByEmail(String email) {
        return storage.values().stream()
                .filter(user -> user.getEmail().equals(email))
                .findFirst();
    }

    @Override
    public List<User> findByRole(UserRole role) {
        return storage.values().stream()
                .filter(user -> user.getRole().equals(role))
                .collect(Collectors.toList());
    }
}