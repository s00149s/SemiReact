package com.everyday.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.everyday.model.ResponseDTO;
import com.everyday.model.UserDTO;
import com.everyday.service.UserService;

@RestController
@RequestMapping(value = "/api/v1/app/")
public class UserController {
	

    @Autowired
    private UserService userService;

    @RequestMapping(value = "findAll", method = RequestMethod.GET)
    public ResponseEntity<?> findAll() {
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setResultCode("S0001");
        responseDTO.setRes(userService.findAll());
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }
    
    @RequestMapping(value = "regist", method = RequestMethod.GET)
    public String regist() {
    	
        UserDTO user = new UserDTO();
        int id = new Random().nextInt(100000);
      
        user.setId("grmoon" + Integer.toString(id));
        user.setEmail("gmoon.au@gmail.com");
        user.setEntranceyear("2002");
        user.setNickname("지라이");
        user.setPassword("P@ssw0rd1!");
        user.setSchool("한국대학교");
               
        userService.regist(user);
        //mapper.insert(user);
        
    	return "OK";
    }
}