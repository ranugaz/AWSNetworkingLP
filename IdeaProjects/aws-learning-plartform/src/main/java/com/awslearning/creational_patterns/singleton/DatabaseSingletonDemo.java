// DatabaseSingletonDemo.java
package com.awslearning.creational_patterns.singleton;

public class DatabaseSingletonDemo {
    public static void main(String[] args) {
        // Get the database manager instance
        DatabaseConnectionManager db1 = DatabaseConnectionManager.getInstance();
        DatabaseConnectionManager db2 = DatabaseConnectionManager.getInstance();

        // Verify both references point to the same instance
        System.out.println("Are both references the same instance? " + (db1 == db2));

        // Test database operations
        db1.connect();
        db1.executeQuery("SELECT * FROM courses");

        // Even though we use db2, it's the same instance as db1
        System.out.println("Is db2 connected? " + db2.isConnected());
        db2.executeQuery("SELECT * FROM students");

        // Disconnect using either reference
        db2.disconnect();
    }
}