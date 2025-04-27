package com.awslearning.repositories;

import com.awslearning.models.User;
import com.awslearning.enums.UserRole;
import java.util.List;
import java.util.Optional;

public interface UserRepository extends Repository<User, String> {
    // Additional user-specific methods
    Optional<User> findByEmail(String email);
    List<User> findByRole(UserRole role);
}