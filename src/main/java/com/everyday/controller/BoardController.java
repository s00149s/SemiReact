package com.everyday.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everyday.model.BoardDTO;
import com.everyday.service.BoardService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value = "/api/")
public class BoardController {

	private static final Logger log = LoggerFactory.getLogger(BoardController.class);
	
    @Autowired
    private BoardService boardService;
    
    @PostMapping(value = "board/upload")
    public ResponseEntity boardUpload(HttpServletRequest request, @RequestBody BoardDTO board ) {
    	log.info("board/upload");
    	log.info(board.getTitle());
        return boardService.upload(board);
    }
    
}
