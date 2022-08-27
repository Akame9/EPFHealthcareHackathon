package com.healthcare.menstrualhealth.dtos;

public class userDetailsDto {
    
    private String username;
    private String password;
    private String age;
    private String address;

    public userDetailsDto(String password, String username, String age, String address) {
        this.password = password;
        this.username = username;
        this.age = age;
        this.address = address;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    
}
