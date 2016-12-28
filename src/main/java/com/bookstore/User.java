package com.bookstore;

import java.time.LocalDateTime;

/**
 * Created by keroles5 on 12/27/16.
 */
public class User {
    private  long UserId ;
    private  String FirstName ;
    private  String LastName ;
    private  String Email ;
    private  String UserName ;
    private  String Password ;
    private  LocalDateTime CreatedAt ;
    private  LocalDateTime UpdatedAt ;
    private  boolean IsEnabled ;

    public long getUserId() {
        return UserId;
    }

    public void setUserId(long userId) {
        UserId = userId;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public LocalDateTime getCreatedAt() {
        return CreatedAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        CreatedAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return UpdatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        UpdatedAt = updatedAt;
    }

    public boolean isEnabled() {
        return IsEnabled;
    }

    public void setEnabled(boolean enabled) {
        IsEnabled = enabled;
    }
}
