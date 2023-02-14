package com.bandesal.demo.dao;

import com.bandesal.demo.models.Users;

import java.util.List;
public interface UserDao {
    List<Users> getUsers();

    void delete(int id);

    void register(Users users);

}
