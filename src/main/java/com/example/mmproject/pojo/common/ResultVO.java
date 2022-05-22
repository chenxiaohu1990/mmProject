package com.example.mmproject.pojo.common;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author 陈小虎
 * @description 返回结果通用类
 * @since 2022/5/4 16:33
 */
@Data
public class ResultVO<T> {

    private BigDecimal code;

    private String msg;

    private T resultData;
}
