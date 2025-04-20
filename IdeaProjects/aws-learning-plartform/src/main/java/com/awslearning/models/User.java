package com.awslearning.models;

import com.awslearning.enums.UserRole;
import com.awslearning.enums.AccountStatus;
import java.util.Date;

public class User {
    private String userId;
    private String email;
    private String password;
    private String name;
    private UserRole role;
    private AccountStatus status;
    private Date lastLoginDate;

    // Constructor
    public User(String userId, String email, String name, UserRole role) {
        this.userId = userId;
        this.email = email;
        this.name = name;
        this.role = role;
        this.status = AccountStatus.UNVERIFIED;
        this.lastLoginDate = new Date();
    }

    // Getters and Setters
    public String getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserRole getRole() {
        return role;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    // Methods
    public boolean register() {
        // Implementation for user registration
        return true;
    }

    public boolean login() {
        this.lastLoginDate = new Date();
        return true;
    }

    public boolean resetPassword(String newPassword) {
        this.password = newPassword;
        return true;
    }

    public boolean updateProfile(String name, String email) {
        this.name = name;
        this.email = email;
        return true;
    }

    public boolean enrollInCourse(String courseId) {
        // Implementation for course enrollment
        return true;
    }
}