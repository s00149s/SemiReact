package com.everyday.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.everyday.model.UserDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Mapper
@Repository
public interface UserMapper {

     //public ArrayList<HashMap<String, Object>> findAll();
     
    public void insert(UserDTO user);
     
    public void update(UserDTO user);

	public List<UserDTO> selectAll();
	
	public UserDTO selectOne(String id);
     
}