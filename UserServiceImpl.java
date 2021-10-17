package com.cg.hbm.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.hbm.entities.User;
import com.cg.hbm.exception.UserNotFoundException;
import com.cg.hbm.repository.IUserRepository;

@Service
public class UserServiceImpl implements IUserService{
	
	@Autowired
	private IUserRepository userRepository;

	@Override
	public User addUser(User user) {
	 return userRepository.save(user);
	}

	@Override
	public User updateUser(Integer user_id, User user) {
		User existingUser = userRepository.findById(user_id).orElseThrow(
				() -> new UserNotFoundException("User with Id " + user_id +" not found"));
		{
			existingUser.setUser_name(user.getUser_name());
			existingUser.setEmail(user.getEmail());
			existingUser.setPassword(user.getPassword());
			existingUser.setRole(user.getRole());
			existingUser.setMobile(user.getMobile());
			existingUser.setAddress(user.getAddress());
			userRepository.save(existingUser);
			return existingUser;
		}
	}

	@Override
	public User removeUser(Integer user_id) {
		User user = showUser(user_id);
	 userRepository.deleteById(user.getUser_id());
	 return null;
	}

	@Override
	public List<User> showAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public User showUser(Integer user_id) {
		return userRepository.findById(user_id).orElseThrow(
				() -> new UserNotFoundException("User with Id " + user_id +" not found"));
	}

}
