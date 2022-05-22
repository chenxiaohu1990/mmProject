package com.example.mmproject.userservice.impi;

import com.example.mmproject.pojo.common.FieldUtils;
import com.example.mmproject.pojo.common.ResultVO;
import com.example.mmproject.pojo.user.User;
import com.example.mmproject.user.UserDao;
import com.example.mmproject.userservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @author 陈小虎1
 * @description UserServiceImpl
 * @since 2022/5/4 17:38
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;
    @Override
    public ResultVO getUserInfo(User user) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(FieldUtils.SUCCESS_CODE);
        User user1 = userDao.getUserInfo(user);
        if(Objects.isNull(user1)){
            resultVO.setCode(FieldUtils.ERROR_CODE);
            resultVO.setMsg("无有效数据");
        }else{
            resultVO.setMsg("查询成功");
            resultVO.setResultData(user1);
        }

        return resultVO;
    }
}
