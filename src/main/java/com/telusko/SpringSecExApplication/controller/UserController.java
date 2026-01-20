package com.telusko.SpringSecExApplication.controller;

import com.telusko.SpringSecExApplication.model.Student;
import com.telusko.SpringSecExApplication.model.Users;
import com.telusko.SpringSecExApplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/register")
    public Users register(@RequestBody Users user){

        return service.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody Users user){
        System.out.println(user);
        return service.verify(user);
    }

    @GetMapping("/users")
    public List<Users> getAllUsers(){
        return service.getAllUsers();
    }


}
