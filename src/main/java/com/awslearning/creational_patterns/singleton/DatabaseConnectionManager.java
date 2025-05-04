// DatabaseConnectionManager.java
package com.awslearning.creational_patterns.singleton;

public class DatabaseConnectionManager {
    // Private static instance
    private static DatabaseConnectionManager instance;

    // Connection details
    private String connectionUrl;
    private boolean isConnected;

    // Private constructor to prevent direct instantiation
    private DatabaseConnectionManager() {
        this.connectionUrl = "jdbc:mysql://localhost:3306/aws_learning_platform";
        this.isConnected = false;
    }

    // Thread-safe getInstance method
    public static synchronized DatabaseConnectionManager getInstance() {
        if (instance == null) {
            instance = new DatabaseConnectionManager();
        }
        return instance;
    }

    // Business methods
    public void connect() {
        if (!isConnected) {
            System.out.println("Connecting to database: " + connectionUrl);
            // Add actual database connection logic here
            isConnected = true;
        }
    }

    public void disconnect() {
        if (isConnected) {
            System.out.println("Disconnecting from database");
            // Add actual database disconnection logic here
            isConnected = false;
        }
    }

    public boolean isConnected() {
        return isConnected;
    }

    public void executeQuery(String query) {
        if (isConnected) {
            System.out.println("Executing query: " + query);
            // Add actual query execution logic here
        } else {
            System.out.println("Not connected to database");
        }
    }
}