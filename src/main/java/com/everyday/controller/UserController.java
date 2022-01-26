package com.everyday.controller;

import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.everyday.model.ResponseDTO;
import com.everyday.model.UserDTO;
import com.everyday.service.UserService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value = "/api/")
public class UserController {
	

	private static final Logger log = LoggerFactory.getLogger(UserController.class);
	
    @Autowired
    private UserService userService;
    
    @RequestMapping( "/" )
    public String index() { 
    	return "index"; 
    }


    @RequestMapping(value = "getAllUsers", method = RequestMethod.GET)
    public List<UserDTO> getAllUsers() {
        //ResponseDTO responseDTO = new ResponseDTO();
        //responseDTO.setResultCode("S0001");
        //responseDTO.setRes(userService.getAllUsers());
        //return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    	return userService.getAllUsers();
    }
    
    //@RequestMapping(value = "user/regist/", method = RequestMethod.GET)
    @PostMapping(value = "user/regist")
    public UserDTO userRegist(HttpServletRequest request, @RequestBody UserDTO user ) {
    	log.info("user/regist");
    	log.info(user.getId());
        return userService.regist(user);
        //mapper.insert(user);
    }
    
    @RequestMapping(value = {"user/checkId/{id}"}, method = RequestMethod.POST)
    public @ResponseBody Boolean checkId(@PathVariable(value="id") final String id) {
    	log.info("user/checkId : " + id);
    	UserDTO user = userService.getUserById(id);
        if(user == null) {
        	return true;
        } else {
        	return false;
        }
    }
    
    @RequestMapping(value = "user/edit", method = RequestMethod.GET)
    public UserDTO userEdit() {
    	
		String id = "grmoon65824";
	
        UserDTO user = userService.getUserById(id);
        String password =  Integer.toString(new Random().nextInt(100000));
    
        user.setPassword(password);
        user.setSchool("한국대학교" + password);
               
        return userService.edit(user);
        //mapper.insert(user);
    }
    
    @RequestMapping(value = "user/list", method = RequestMethod.GET)
    public String userList(Model model) {
    	model.addAttribute("users", userService.getAllUsers());
    	return "user/list";
    }
}