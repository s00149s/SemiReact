package com.everyday.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.everyday.model.BoardDTO;

@Mapper
@Repository
public interface BoardMapper {

	public void insert(BoardDTO board);

}
