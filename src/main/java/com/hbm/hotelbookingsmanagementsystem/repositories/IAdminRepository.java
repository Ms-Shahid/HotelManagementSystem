package com.hbm.hotelbookingsmanagementsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hbm.hotelbookingsmanagementsystem.entites.Admin;

public interface IAdminRepository extends JpaRepository<Admin, Integer>{

}
