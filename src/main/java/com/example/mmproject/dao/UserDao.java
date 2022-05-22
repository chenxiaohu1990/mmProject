package com.example.mmproject.dao;

import com.example.mmproject.pojo.user.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    User getUserInfo(User user);
}
