package com.example.demo1.Controller;

import com.example.demo1.Model.User;
import com.example.demo1.Serv.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class controller {

    @Autowired
    private Service service;

    @PostMapping("/login")
    public User login(@RequestBody User user){
        return service.login(user);
    }
@GetMapping(path="/users")
    public List<User> GetUser(){
        return service.getAllUsers();
}
}

