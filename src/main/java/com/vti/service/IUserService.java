package com.vti.service;

import com.vti.entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface IUserService {
    List<User> findAll() ;

    User findById(int id) ;

    User findByEmailAndPassword(String email, String password) ;

    int deleteById(int id) ;

    int create(String fullName, String email) ;
}
