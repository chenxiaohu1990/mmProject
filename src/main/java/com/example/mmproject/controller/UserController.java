package com.example.mmproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/getUserInfo")
    public String getUserInfo(){
        return "user";
    }
}
