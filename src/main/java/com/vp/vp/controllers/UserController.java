package com.vp.vp.controllers;

import com.vp.vp.dtos.UserDTO;
import com.vp.vp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value="/users")
    ResponseEntity<List<UserDTO>> getUsers(){

        return ResponseEntity.ok(userService.getUsers());
    };
}
