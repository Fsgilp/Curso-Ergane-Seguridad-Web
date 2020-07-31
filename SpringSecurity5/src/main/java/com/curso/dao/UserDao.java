package com.curso.dao;

import java.util.List;

import com.curso.model.User;

public interface UserDao {
   void save(User user);
   List<User> list();
}
