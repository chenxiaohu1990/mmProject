package com.example.mmproject.user;

import com.example.mmproject.pojo.user.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    User getUserInfo(User user);
}
