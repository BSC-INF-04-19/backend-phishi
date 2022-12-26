package com.example.demo1.Serv;

import com.example.demo1.Model.User;
import com.example.demo1.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@org.springframework.stereotype.Service
public class Service {
   @Autowired
    private UserRepository userRepository;

   public User login(User user){
       return userRepository.save(user);
   }
   public List<User> getAllUsers(){
       return userRepository.findAll();
   }
}
