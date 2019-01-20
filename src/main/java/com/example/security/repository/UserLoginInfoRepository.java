package com.example.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.security.entity.UserLoginInfo;

@Repository
public interface UserLoginInfoRepository extends JpaRepository<UserLoginInfo, String>{
}