package com.everyday.controller;

import java.util.List;
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
@RequestMapping(value = "/api/")
public class UserController {
	

    @Autowired
    private UserService userService;

    @RequestMapping(value = "getAllUsers", method = RequestMethod.GET)
    public List<UserDTO> getAllUsers() {
        //ResponseDTO responseDTO = new ResponseDTO();
        //responseDTO.setResultCode("S0001");
        //responseDTO.setRes(userService.getAllUsers());
        //return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    	return userService.getAllUsers();
    }
    
    @RequestMapping(value = "regist", method = RequestMethod.GET)
    public UserDTO regist() {
    	
        UserDTO user = new UserDTO();
        int id = new Random().nextInt(100000);
      
        user.setId("grmoon" + Integer.toString(id));
        user.setEmail("gmoon.au@gmail.com");
        user.setEntranceyear("2002");
        user.setNickname("지라이");
        user.setPassword("1112");
        user.setSchool("한국대학교");
               
        return userService.regist(user);
        //mapper.insert(user);
    }
    
    @RequestMapping(value = "edit", method = RequestMethod.GET)
    public UserDTO edit() {
    	
		String id = "grmoon65824";
	
        UserDTO user = userService.getUserById(id);
        String password =  Integer.toString(new Random().nextInt(100000));
    
        user.setPassword(password);
        user.setSchool("한국대학교" + password);
               
        return userService.edit(user);
        //mapper.insert(user);
    }
}