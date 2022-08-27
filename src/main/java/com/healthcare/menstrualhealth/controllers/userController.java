package com.healthcare.menstrualhealth.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthcare.menstrualhealth.dtos.userDetailsDto;

@RestController
@RequestMapping("/menstrulhealth/user")
public class userController {

    @PostMapping(value = "/register")
    public ResponseEntity<Boolean> register(@RequestBody userDetailsDto userdetails){
        
        return new ResponseEntity<>(true, HttpStatus.ACCEPTED);
    }
    
}
