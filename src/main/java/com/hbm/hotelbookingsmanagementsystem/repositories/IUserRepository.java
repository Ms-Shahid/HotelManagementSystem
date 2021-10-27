package com.hbm.hotelbookingsmanagementsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hbm.hotelbookingsmanagementsystem.entites.User;

public interface IUserRepository extends JpaRepository<User, Integer>{

}
