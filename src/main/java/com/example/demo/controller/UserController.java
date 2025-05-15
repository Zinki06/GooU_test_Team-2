package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    // 메모리에 저장 (실제 서비스라면 DB 사용)
    private final List<User> userList = new ArrayList<>();

    // [POST] 유저 추가
    @PostMapping
    public User addUser(@RequestBody User user) {
        userList.add(user);
        return user; // 저장된 유저 정보 반환
    }

    // [GET] 유저 전체 조회
    @GetMapping
    public List<User> getAllUsers() {
        return userList;
    }
} 