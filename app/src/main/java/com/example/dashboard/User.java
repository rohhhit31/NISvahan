package com.example.dashboard;

public class User {
    String nameET, userNameET, emailET, phoneET, passwordET;

    public User(String nameET, String userNameET, String emailET, String phoneET, String passwordET) {
        this.nameET = nameET;
        this.userNameET = userNameET;
        this.emailET = emailET;
        this.phoneET = phoneET;
        this.passwordET = passwordET;
    }

    public String getNameET() {
        return nameET;
    }

    public void setNameET(String nameET) {
        this.nameET = nameET;
    }

    public String getUserNameET() {
        return userNameET;
    }

    public void setUserNameET(String userNameET) {
        this.userNameET = userNameET;
    }

    public String getEmailET() {
        return emailET;
    }

    public void setEmailET(String emailET) {
        this.emailET = emailET;
    }

    public String getPhoneET() {
        return phoneET;
    }

    public void setPhoneET(String phoneET) {
        this.phoneET = phoneET;
    }

    public String getPasswordET() {
        return passwordET;
    }

    public void setPasswordET(String passwordET) {
        this.passwordET = passwordET;
    }
}