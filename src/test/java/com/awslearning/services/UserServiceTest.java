package com.awslearning.services;

import com.awslearning.models.User;
import com.awslearning.repositories.UserRepository;
import com.awslearning.exceptions.UserNotFoundException;
import com.awslearning.exceptions.ValidationException;
import com.awslearning.enums.UserRole;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {
    @Mock
    private UserRepository userRepository;

    private UserService userService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        userService = new UserService(userRepository);
    }

    @Test
    void createUser_ValidUser_ReturnsUser() {
        // Arrange
        User user = new User("U001", "test@example.com", "Test User", UserRole.STUDENT);
        when(userRepository.save(any(User.class))).thenReturn(user);

        // Act
        User result = userService.createUser(user);

        // Assert
        assertNotNull(result);
        assertEquals("test@example.com", result.getEmail());
        verify(userRepository).save(user);
    }

    @Test
    void createUser_InvalidEmail_ThrowsValidationException() {
        // Arrange
        User user = new User("U001", "invalid-email", "Test User", UserRole.STUDENT);

        // Act & Assert
        assertThrows(ValidationException.class, () -> userService.createUser(user));
    }

    @Test
    void getUser_ExistingId_ReturnsUser() {
        // Arrange
        User user = new User("U001", "test@example.com", "Test User", UserRole.STUDENT);
        when(userRepository.findById("U001")).thenReturn(Optional.of(user));

        // Act
        User result = userService.getUser("U001");

        // Assert
        assertNotNull(result);
        assertEquals("U001", result.getUserId());
    }

    @Test
    void getUser_NonExistingId_ThrowsUserNotFoundException() {
        // Arrange
        when(userRepository.findById("U001")).thenReturn(Optional.empty());

        // Act & Assert
        assertThrows(UserNotFoundException.class, () -> userService.getUser("U001"));
    }
}