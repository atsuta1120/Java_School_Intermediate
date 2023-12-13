package com.example.javasamplepj.domain.model.user;

import lombok.Data;

@Data
public class RequestLogin {
 
  private String mailAddress;
 
  private String password;
}