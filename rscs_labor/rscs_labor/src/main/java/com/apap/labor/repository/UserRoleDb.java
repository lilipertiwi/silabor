package com.apap.labor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apap.labor.model.UserRoleModel;


public interface UserRoleDb extends JpaRepository<UserRoleModel, Long>{
	UserRoleModel findByUsername(String username);

}

