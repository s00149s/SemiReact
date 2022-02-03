package com.everyday.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.everyday.mapper.BoardMapper;
import com.everyday.model.BoardDTO;

@Service
public class BoardService {
    @Autowired
    BoardMapper boardMapper;

    public ResponseEntity upload(BoardDTO board ) {
    	boardMapper.insert(board);
    	return ResponseEntity.ok("게시글 작성 완료!");
    }
 
}
