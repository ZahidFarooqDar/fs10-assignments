package com.example.UserManagementSystem.model;

public class User {
    private int UserId;
    private String Name;
    private String UserName;
    private String Address;
    private long Contact;

    public User(int userId, String name, String userName, String address, long contact) {
        UserId = userId;
        Name = name;
        UserName = userName;
        Address = address;
        Contact = contact;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public long getContact() {
        return Contact;
    }

    public void setContact(long contact) {
        Contact = contact;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserId=" + UserId +
                ", Name='" + Name + '\'' +
                ", UserName='" + UserName + '\'' +
                ", Address='" + Address + '\'' +
                ", Contact=" + Contact +
                '}';
    }
}
