package com.example.mmproject.controller;

import com.example.mmproject.pojo.common.ResultVO;
import com.example.mmproject.pojo.user.User;
import com.example.mmproject.userservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 陈小虎
 * @description UserController
 * @since 2022/5/22 18:18
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/getUserInfo")
    public ResultVO getUserInfo(User user){
        return userService.getUserInfo(user);
    }
}
