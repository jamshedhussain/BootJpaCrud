package com.itz.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itz.entity.UserEntity;

public interface UserDao extends JpaRepository<UserEntity, Serializable> {

	
}//Interface
