package com.awslearning.services;

import com.awslearning.models.User;
import com.awslearning.repositories.UserRepository;
import com.awslearning.exceptions.UserNotFoundException;
import com.awslearning.exceptions.ValidationException;
import java.util.List;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        validateUser(user);
        userRepository.save(user);
        return user;
    }

    public User getUser(String userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new UserNotFoundException(userId));
    }

    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email)
                .orElseThrow(() -> new UserNotFoundException("Email: " + email));
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User updateUser(String userId, User user) {
        if (!userRepository.exists(userId)) {
            throw new UserNotFoundException(userId);
        }
        validateUser(user);
        user.setUserId(userId);
        userRepository.save(user);
        return user;
    }

    public void deleteUser(String userId) {
        if (!userRepository.exists(userId)) {
            throw new UserNotFoundException(userId);
        }
        userRepository.delete(userId);
    }

    private void validateUser(User user) {
        if (user.getEmail() == null || !isValidEmail(user.getEmail())) {
            throw new ValidationException("email", "Invalid email format");
        }
        if (user.getName() == null || user.getName().trim().isEmpty()) {
            throw new ValidationException("name", "User name cannot be empty");
        }
    }

    private boolean isValidEmail(String email) {
        return email != null && email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }
}