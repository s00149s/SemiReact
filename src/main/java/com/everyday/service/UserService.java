package com.everyday.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everyday.mapper.UserMapper;
import com.everyday.model.UserDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    //public ArrayList<HashMap<String, Object>> findAll() {
    //    return userMapper.findAll();
    //}
    
    public UserDTO regist(UserDTO user ) {
    	userMapper.insert(user);
    	return userMapper.selectOne(user.getId());
    }
    
    public UserDTO edit(UserDTO user ) {
    	userMapper.update(user);
    	return userMapper.selectOne(user.getId());
    }

	public List<UserDTO> getAllUsers() {
		// TODO Auto-generated method stub
		return userMapper.selectAll();
	}
	
	public UserDTO getUserById(String id) {
		// TODO Auto-generated method stub
		return userMapper.selectOne(id);
	}
}