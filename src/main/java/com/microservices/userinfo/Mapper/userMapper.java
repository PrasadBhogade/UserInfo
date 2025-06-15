package com.microservices.userinfo.Mapper;

import com.microservices.userinfo.DTO.userDTO;
import com.microservices.userinfo.Entity.userEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface userMapper {
        userMapper INSTANCE = Mappers.getMapper(userMapper.class);
        userEntity mapUserDTOToUser(userDTO userDTO);
        userDTO mapUserToUserDTO(userEntity user);
    }


