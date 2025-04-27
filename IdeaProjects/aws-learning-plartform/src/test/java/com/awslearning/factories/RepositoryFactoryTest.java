package com.awslearning.factories;

import com.awslearning.repositories.*;
import com.awslearning.repositories.inmemory.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RepositoryFactoryTest {

    @Test
    void testGetCourseRepository() {
        CourseRepository repository = RepositoryFactory.getCourseRepository("MEMORY");
        assertNotNull(repository);
        assertTrue(repository instanceof InMemoryCourseRepository);
    }

    @Test
    void testGetUserRepository() {
        UserRepository repository = RepositoryFactory.getUserRepository("MEMORY");
        assertNotNull(repository);
        assertTrue(repository instanceof InMemoryUserRepository);
    }

    @Test
    void testGetContentRepository() {
        ContentRepository repository = RepositoryFactory.getContentRepository("MEMORY");
        assertNotNull(repository);
        assertTrue(repository instanceof InMemoryContentRepository);
    }

    @Test
    void testInvalidStorageType() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            RepositoryFactory.getCourseRepository("INVALID");
        });
        assertTrue(exception.getMessage().contains("Invalid storage type"));
    }

    @Test
    void testDatabaseNotImplemented() {
        Exception exception = assertThrows(UnsupportedOperationException.class, () -> {
            RepositoryFactory.getCourseRepository("DATABASE");
        });
        assertTrue(exception.getMessage().contains("Database implementation not yet available"));
    }
}