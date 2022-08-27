package com.healthcare.menstrualhealth.dtos;

import java.util.Date;

public class menstrulCycleDetailsDto {
    
    private String username;
    private Date startDate;
    private Date endDate;
    private String flow;
    private Integer numberOfPads;
    private Integer cycleLengthInDays;
    
    public menstrulCycleDetailsDto(String username, Date startDate, Date endDate, String flow, Integer numberOfPads,
            Integer cycleLengthInDays) {
        this.username = username;
        this.startDate = startDate;
        this.endDate = endDate;
        this.flow = flow;
        this.numberOfPads = numberOfPads;
        this.cycleLengthInDays = cycleLengthInDays;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getFlow() {
        return flow;
    }

    public void setFlow(String flow) {
        this.flow = flow;
    }

    public Integer getNumberOfPads() {
        return numberOfPads;
    }

    public void setNumberOfPads(Integer numberOfPads) {
        this.numberOfPads = numberOfPads;
    }

    public Integer getCycleLengthInDays() {
        return cycleLengthInDays;
    }

    public void setCycleLengthInDays(Integer cycleLengthInDays) {
        this.cycleLengthInDays = cycleLengthInDays;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    
}
