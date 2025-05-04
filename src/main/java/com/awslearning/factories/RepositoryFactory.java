// RepositoryFactory.java
package com.awslearning.factories;

import com.awslearning.repositories.*;
import com.awslearning.repositories.inmemory.*;

public class RepositoryFactory {
    public static final String MEMORY = "MEMORY";
    public static final String DATABASE = "DATABASE";  // For future use

    public static CourseRepository getCourseRepository(String storageType) {
        switch (storageType) {
            case MEMORY:
                return new InMemoryCourseRepository();
            case DATABASE:
                // Future implementation
                throw new UnsupportedOperationException("Database implementation not yet available");
            default:
                throw new IllegalArgumentException("Invalid storage type: " + storageType);
        }
    }

    public static UserRepository getUserRepository(String storageType) {
        switch (storageType) {
            case MEMORY:
                return new InMemoryUserRepository();
            case DATABASE:
                // Future implementation
                throw new UnsupportedOperationException("Database implementation not yet available");
            default:
                throw new IllegalArgumentException("Invalid storage type: " + storageType);
        }
    }

    public static ContentRepository getContentRepository(String storageType) {
        switch (storageType) {
            case MEMORY:
                return new InMemoryContentRepository();
            case DATABASE:
                // Future implementation
                throw new UnsupportedOperationException("Database implementation not yet available");
            default:
                throw new IllegalArgumentException("Invalid storage type: " + storageType);
        }
    }
}