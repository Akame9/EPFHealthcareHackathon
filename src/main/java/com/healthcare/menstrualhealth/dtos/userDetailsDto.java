package com.healthcare.menstrualhealth.dtos;

public class userDetailsDto {
    
    private String username;
    private String age;
    private String date;

    public userDetailsDto(String username, String age, String date) {
        this.username = username;
        this.age = age;
        this.date = date;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    

}
