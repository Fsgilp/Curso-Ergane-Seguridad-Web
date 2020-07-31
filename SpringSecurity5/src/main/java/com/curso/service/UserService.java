package com.curso.service;

import java.util.List;

import com.curso.model.User;

public interface UserService {
   void save(User user);

   List<User> list();
}
