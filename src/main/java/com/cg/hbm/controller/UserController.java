package com.cg.hbm.controller;

import java.util.List;
//import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.hbm.entities.User;
import com.cg.hbm.service.IUserService;


@RestController
@RequestMapping(value="/user")
public class UserController 
{
	@Autowired
	private IUserService userService;
	
	@PostMapping(value="/save")
	public ResponseEntity<User> saveUser(@Valid @RequestBody User user)
	{
		return new ResponseEntity<User>(userService.addUser(user),HttpStatus.CREATED);
	}
	
	@PutMapping(value="/update/{user_id}")
	public ResponseEntity<User> updateUser(@PathVariable Integer user_id,@RequestBody User user)
	{
		User updatedUser = userService.updateUser(user_id,user);
		return new ResponseEntity<User>(updatedUser,HttpStatus.CREATED);
	}
	
	@DeleteMapping(value="/delete/{user_id}")
	public ResponseEntity<String> removeUser(@PathVariable Integer user_id)
	{
		userService.removeUser(user_id);
		String msg = "User with Id "+user_id+" Deleted Successfully";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	@GetMapping(value="/showAllUsers")
	public ResponseEntity<List<User>> showAllUsers()
	{
		List<User> allUsers = userService.showAllUsers();
		return new ResponseEntity<List<User>>(allUsers,HttpStatus.OK);
	}
	
	@GetMapping(value="/showUser/{user_id}")
	public ResponseEntity<User> getBook(@PathVariable Integer user_id)
	{
		User userById = userService.showUser(user_id);
		return new ResponseEntity<User>(userById,HttpStatus.OK);
	}

}
