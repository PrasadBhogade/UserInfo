package com.microservices.userinfo.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class userDTO {

    private int userId;
    private String userName;
    private String userPassword;
    private String address;
    private String city;
}
