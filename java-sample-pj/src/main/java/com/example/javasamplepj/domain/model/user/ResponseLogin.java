package com.example.javasamplepj.domain.model.user;

import lombok.Data;

@Data
public class ResponseLogin {

  private String status;

  private String userId;

  private String userName;

  private String mailAddress;
}