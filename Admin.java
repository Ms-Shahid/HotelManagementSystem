package com.company.HotelBookingManagementSystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {
	
	@Id
	private Integer admin_Id;
	@Column
	private String admin_name;
	@Column
	private String password;
	
	
	
	public Admin() {
		super();
	}
	public Admin(Integer admin_Id, String admin_name, String password) {
		super();
		this.admin_Id = admin_Id;
		this.admin_name = admin_name;
		this.password = password;
	}
	public Integer getAdmin_Id() {
		return admin_Id;
	}
	public void setAdmin_Id(Integer admin_Id) {
		this.admin_Id = admin_Id;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
