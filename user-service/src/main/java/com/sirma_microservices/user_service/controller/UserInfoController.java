package com.sirma_microservices.user_service.controller;


import com.sirma_microservices.user_service.model.UserInfo;
import com.sirma_microservices.user_service.services.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserInfoController {

    @Autowired
    private UserInfoService service;

    @GetMapping
    public ResponseEntity<List<UserInfo>> getAll(){
        try {
            List<UserInfo> users = service.getAllUsers();
            return ResponseEntity.ok(users);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody UserInfo user){
        try {
            service.create(user);
            return ResponseEntity.ok("Register successfully.");
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
