package com.revature.project_0.dao;

import java.util.Optional;

import com.revature.project_0.models.Account;
import com.revature.project_0.models.User;


public interface UserDAO {
	//An unregistered user can register by creating a username and password
	public Boolean createUser (String username, String password, String type);
	//A registered user can login with their username and password  
	public Optional <User> getUser (String username);
	public Boolean comparePassword (String password, User user);
	//A user can logout. 
	public Boolean logOut();
}
