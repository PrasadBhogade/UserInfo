package com.microservices.userinfo.Repo;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.microservices.userinfo.Entity.userEntity;

@Repository
public interface userRepo extends JpaRepository<userEntity,Integer> {
}
