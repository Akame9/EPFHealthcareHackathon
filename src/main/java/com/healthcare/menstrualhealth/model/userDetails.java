package com.healthcare.menstrualhealth.model;

public class userDetails {
    
    private String username;
    private String password;
    private Integer age;
    private String address;

    public userDetails(String password, String username, Integer age, String address) {
        this.password = password;
        this.username = username;
        this.age = age;
        this.address = address;
    }

    public userDetails(){

    }

    
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
