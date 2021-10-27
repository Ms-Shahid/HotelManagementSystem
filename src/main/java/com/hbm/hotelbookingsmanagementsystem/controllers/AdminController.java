package com.hbm.hotelbookingsmanagementsystem.controllers;

import java.util.List;
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

import com.hbm.hotelbookingsmanagementsystem.entites.Admin;
import com.hbm.hotelbookingsmanagementsystem.services.IAdminService;

@RestController
@RequestMapping(value = "/admin")
public class AdminController {
	@Autowired
	private IAdminService adminService;

	@PostMapping(value = "/add")
	public ResponseEntity<Admin> saveAdmin(@Valid @RequestBody Admin admin) {
		return new ResponseEntity<Admin>(adminService.saveAdmin(admin), HttpStatus.CREATED);
	}

	@GetMapping(value = "/getallAdmins")
	public ResponseEntity<List<Admin>> getAllAdmins() {
		List<Admin> allAdmins = adminService.getAllAdmins();
		return new ResponseEntity<List<Admin>>(allAdmins, HttpStatus.OK);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Admin> getAdmin(@PathVariable Integer id) {
		Admin adminById = adminService.getAdmin(id);
		return new ResponseEntity<Admin>(adminById, HttpStatus.OK);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<String> deleteAdmin(@PathVariable Integer id) {
		adminService.deleteAdmin(id);
		String msg = "Admin with Id" + id + "Deleted Successfully";
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<Admin> updateAdmin(@PathVariable Integer id, @RequestBody Admin admin) {
		Admin updatedAdmin = adminService.updateAdmin(id, admin);
		return new ResponseEntity<Admin>(updatedAdmin, HttpStatus.CREATED);
	}

}
