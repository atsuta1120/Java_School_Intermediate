package com.example.javasamplepj.domain.model.user;

import lombok.Data;

@Data
public class RequestUserRegist {
 
  private String userName;
 
  private String password;
 
  private String mailAddress;
}