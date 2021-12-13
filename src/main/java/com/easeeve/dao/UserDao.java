package com.easeeve.dao;

import com.easeeve.model.User;
import org.springframework.stereotype.Component;


@Component
public interface UserDao {
    public int addUser(User user);
    public User getUserByUserName(String userName);
}
