package com.microservices.userinfo.Service;

import com.microservices.userinfo.DTO.userDTO;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.microservices.userinfo.Repo.userRepo;
import com.microservices.userinfo.Mapper.userMapper;
import com.microservices.userinfo.Entity.userEntity;

import java.util.Optional;

@Service
public class userService {

    @Autowired
    userRepo userRepo;

    public userDTO addUser(userDTO userDTO) {
       // userEntity saveUser = userRepo.save(userMapper.INSTANCE.mapUserDTOToUser(userDTO));
        userEntity saveUser = userRepo.save(userMapper.INSTANCE.mapUserDTOToUser(userDTO));
        return userMapper.INSTANCE.mapUserToUserDTO(saveUser);
    }

    public ResponseEntity<userDTO> fetchUserDetailById(Integer userId) {
        Optional<userEntity> fetchUser =userRepo.findById(userId);
        if(fetchUser.isPresent()){
            return new ResponseEntity<>(userMapper.INSTANCE.mapUserToUserDTO(fetchUser.get()), HttpStatus.OK);
        }
        return new ResponseEntity<>(null ,HttpStatus.NOT_FOUND);
    }
}
