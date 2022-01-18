package com.everyday.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everyday.mapper.UserMapper;
import com.everyday.model.UserDTO;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public ArrayList<HashMap<String, Object>> findAll() {
        return userMapper.findAll();
    }
    
    public void regist(UserDTO user ) {
    	userMapper.insert(user);
    }
}