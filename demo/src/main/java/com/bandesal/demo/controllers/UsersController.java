package com.bandesal.demo.controllers;

import com.bandesal.demo.dao.UserDao;
import com.bandesal.demo.models.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsersController {

    @Autowired
    private UserDao userDao;
    @RequestMapping(value = "api/users/{id}")
    public Users getUser(@PathVariable Integer id){
        Users user = new Users();
        user.setId(id);
        user.setUsername("Lucas");

        return user;
    }

    @RequestMapping(value = "api/users", method = RequestMethod.GET)
    public List<Users> getUser(){
        return userDao.getUsers();

    }
    @RequestMapping(value = "api/users", method = RequestMethod.POST)
    public void registerUser(@RequestBody Users users){
        userDao.register(users);
    }



    @RequestMapping(value = "api/users/{id}", method = RequestMethod.DELETE)
    public void deleteUsers(@PathVariable int id){
        userDao.delete(id);

    }

    @RequestMapping(value = "users3")
    public Users searchUsers(){
        Users users = new Users();
        users.setUsername("Lucas");

        return users;
    }

}
