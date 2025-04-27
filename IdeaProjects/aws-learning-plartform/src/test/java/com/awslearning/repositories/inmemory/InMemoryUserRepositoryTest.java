package com.awslearning.repositories.inmemory;

import com.awslearning.models.User;
import com.awslearning.enums.UserRole;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Optional;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class InMemoryUserRepositoryTest {
    private InMemoryUserRepository repository;
    private User testUser;

    @BeforeEach
    void setUp() {
        repository = new InMemoryUserRepository();
        testUser = new User("U001", "test@example.com", "Test User", UserRole.STUDENT);
    }

    @Test
    void testSave() {
        repository.save(testUser);
        Optional<User> found = repository.findById("U001");
        assertTrue(found.isPresent());
        assertEquals(testUser.getEmail(), found.get().getEmail());
    }

    @Test
    void testFindByEmail() {
        repository.save(testUser);
        Optional<User> found = repository.findByEmail("test@example.com");
        assertTrue(found.isPresent());
        assertEquals(testUser.getUserId(), found.get().getUserId());
    }

    @Test
    void testFindByRole() {
        repository.save(testUser);
        List<User> students = repository.findByRole(UserRole.STUDENT);
        assertEquals(1, students.size());
        assertEquals(testUser.getUserId(), students.get(0).getUserId());
    }

    @Test
    void testDelete() {
        repository.save(testUser);
        repository.delete("U001");
        assertFalse(repository.exists("U001"));
    }
}