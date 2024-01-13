package com.example.controller;


import com.example.model.Users;
import com.example.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsersController {
    @Autowired
    private UsersRepository usersRepository;
    @GetMapping("/users")
    List<Users> findAllUsers(){
        return usersRepository.findAll();
    }
    @GetMapping("/users/{id}")
    Users getUsersById(@PathVariable("id") long id){
        return usersRepository.findById(id).get();
    }

}