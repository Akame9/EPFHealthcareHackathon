package com.healthcare.menstrualhealth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcare.menstrualhealth.daos.userRepository;
import com.healthcare.menstrualhealth.dtos.menstrulCycleDetailsDto;
import com.healthcare.menstrualhealth.model.loginInfo;
import com.healthcare.menstrualhealth.model.menstrulCycleDetails;
import com.healthcare.menstrualhealth.model.userDetails;

@Service
public class userService {
    
    @Autowired
    private userRepository user_repo;
    
    public int insertUserDetails(userDetails user_details){
        return user_repo.insertUserDetails(user_details);
    }

    public int insertmenstrualCycleDetails(menstrulCycleDetails mCycleDetails){
        return user_repo.insertmenstrualCycleDetails(mCycleDetails);
    }

    public Boolean login(loginInfo lInfo){
        String password = user_repo.findUser(lInfo.getUsername());
        return lInfo.getPassword().equals(password) ? true : false;
    }
    
    public List<menstrulCycleDetails> getCycleDetails(String username){
        return user_repo.getMenstrulCycleDetails(username);
    }

    public Integer getNextCycle(String username){
        List<Integer> listOfCycleLength = user_repo.getNextCycleDays(username);
        Integer total = 0;
        for(int i =0; i<listOfCycleLength.size();i++){
            total = total + listOfCycleLength.get(i);
        }
        Integer average = total/listOfCycleLength.size();
        return average;
    }
}
