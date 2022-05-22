package com.example.mmproject.pojo.user;

import lombok.Data;

import java.util.Date;

@Data
public class User {

  private String userId;
  private String userName;
  private String passwd;
  private String nickName;
  private String phoneNumber;
  private String createdByName;
  private Date createdDate;
  private String lastUpdateByName;
  private Date lastUpdatedDate;
  private String segment1;
  private String segment2;
  private String segment3;
  private String segment4;
  private String segment5;
}
