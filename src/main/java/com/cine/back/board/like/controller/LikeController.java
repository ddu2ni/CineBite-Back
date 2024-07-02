package com.cine.back.board.like.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cine.back.board.like.service.LikeService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/like")
@RequiredArgsConstructor
public class LikeController implements LikeControllerDocs {

    private final LikeService likeService;

    @Override
    @GetMapping("/post/{postNo}/{userId}")
    public ResponseEntity<String> toggleLike(Long postNo, String userId) {
        log.info("toggleLike 실행, postNo: {} / userId: {}", postNo, userId);
        String msg = likeService.toggleLike(postNo, userId);
        return ResponseEntity.ok().body(msg);
    }

}
