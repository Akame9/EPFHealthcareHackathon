package com.healthcare.menstrualhealth.controllers;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.healthcare.menstrualhealth.dtos.loginInfoDto;
import com.healthcare.menstrualhealth.dtos.menstrulCycleDetailsDto;
import com.healthcare.menstrualhealth.dtos.userDetailsDto;
import com.healthcare.menstrualhealth.model.loginInfo;
import com.healthcare.menstrualhealth.model.menstrulCycleDetails;
import com.healthcare.menstrualhealth.model.userDetails;
import com.healthcare.menstrualhealth.service.userService;

@RestController
@RequestMapping("/menstrulhealth/user")
public class userController {

    @Autowired
    private userService userservice;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping(value = "/register")
    public ResponseEntity<Boolean> register(@RequestBody userDetailsDto userdetailsdto){
        userDetails userdetails = modelMapper.map(userdetailsdto, userDetails.class);
        int inserted = userservice.insertUserDetails(userdetails);
        return inserted==0 ? new ResponseEntity<>(false, HttpStatus.INTERNAL_SERVER_ERROR) : new ResponseEntity<>(true, HttpStatus.CREATED);
    }
    
    @PostMapping(value = "/login")
    public ResponseEntity<Boolean> login(@RequestBody loginInfoDto logininfodto){
        loginInfo logininfo = modelMapper.map(logininfodto, loginInfo.class);
        return userservice.login(logininfo) ?  new ResponseEntity<>(true, HttpStatus.ACCEPTED) : new ResponseEntity<>(false, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @PostMapping(value = "/insertmenstrualCycleDetails")
    public ResponseEntity<Boolean> insertmenstrualCycleDetails(@RequestBody menstrulCycleDetailsDto mCycleDetailsDto){
        menstrulCycleDetails menstrulcycledetails = modelMapper.map(mCycleDetailsDto, menstrulCycleDetails.class);
        int inserted = userservice.insertmenstrualCycleDetails(menstrulcycledetails);
        return inserted==0 ? new ResponseEntity<>(false, HttpStatus.INTERNAL_SERVER_ERROR) : new ResponseEntity<>(true, HttpStatus.CREATED);
    }

    @GetMapping(value = "/getMenstrulCycleDetails")
    public ResponseEntity<List<menstrulCycleDetails>> getMenstrulCycleDetails(@RequestParam String username){
        return new ResponseEntity<List<menstrulCycleDetails>>(userservice.getCycleDetails(username), HttpStatus.ACCEPTED);
    }
    @GetMapping(value = "/getNextCycle")
    public ResponseEntity<Integer> getNextCycle(@RequestParam String username){
        Integer expectedNextCycle = userservice.getNextCycle(username);
        return new ResponseEntity<Integer>(expectedNextCycle, HttpStatus.ACCEPTED);
    } 
    
}
