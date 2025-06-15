package com.microservices.userinfo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.microservices.userinfo.Service.userService;
import com.microservices.userinfo.DTO.userDTO;

@RestController
@RequestMapping("/user")
public class userController {

    @Autowired
    userService userService;

    @PostMapping("/address")
    public ResponseEntity<userDTO> addUser(@RequestBody userDTO userDTO){
        userDTO saveUser = userService.addUser(userDTO);
        return new ResponseEntity<>(saveUser, HttpStatus.CREATED);
    }

    @GetMapping("/fetchUserById/{userId}")
        public ResponseEntity<userDTO> fetchUserDetailById(@PathVariable Integer userId){
    return userService.fetchUserDetailById(userId);
    }

}
