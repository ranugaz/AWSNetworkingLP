package com.awslearning.creational_patterns.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DatabaseConnectionManagerTest {

    @Test
    public void testSingleInstance() {
        DatabaseConnectionManager instance1 = DatabaseConnectionManager.getInstance();
        DatabaseConnectionManager instance2 = DatabaseConnectionManager.getInstance();

        assertNotNull(instance1);
        assertNotNull(instance2);
        assertSame(instance1, instance2); // Ensures same instance
    }

    @Test
    public void testConnectionState() {
        DatabaseConnectionManager manager = DatabaseConnectionManager.getInstance();

        assertFalse(manager.isConnected());

        manager.connect();
        assertTrue(manager.isConnected());

        manager.disconnect();
        assertFalse(manager.isConnected());
    }

    @Test
    public void testQueryExecution() {
        DatabaseConnectionManager manager = DatabaseConnectionManager.getInstance();
        manager.connect();

        assertTrue(manager.isConnected());
        manager.executeQuery("SELECT * FROM courses");

        manager.disconnect();
        assertFalse(manager.isConnected());
    }
}