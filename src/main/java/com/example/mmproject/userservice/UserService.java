package com.example.mmproject.userservice;

import com.example.mmproject.pojo.common.ResultVO;
import com.example.mmproject.pojo.user.User;

/**
 * @author 陈小虎
 * @description 用户基本类
 * @since 2022/5/4 16:29
 */

public interface UserService {

    ResultVO getUserInfo(User user);
}
