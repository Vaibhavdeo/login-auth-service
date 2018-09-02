package com.login.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.login.entities.UserEntity;

public interface LoginDao extends CrudRepository<UserEntity, Integer> {

	List<UserEntity> findByEmail(String email);
}
