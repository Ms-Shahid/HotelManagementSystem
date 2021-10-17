package com.cg.hbm.service;

import java.util.List;
//import java.util.Optional;

import com.cg.hbm.entities.User;


public interface IUserService 
{
        public User addUser(User user);
		public User updateUser( Integer user_id, User user);
		public User removeUser(Integer user_id);
		public List<User> showAllUsers();
		public User showUser(Integer user_id);
	
}
