package com.apap.labor.service;

import com.apap.labor.model.UserRoleModel;

public interface UserRoleService {
	UserRoleModel addUser(UserRoleModel user);
	public String encrypt(String password);
	UserRoleModel findUserByUsername (String usesrname);
	boolean validateOldPassword(UserRoleModel user, String oldPassword);
}