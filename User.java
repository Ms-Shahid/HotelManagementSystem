package com.cg.hbm.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
public class User 
{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer user_id;
	
	@Column
	@NotEmpty(message = "User Name is Required")
	private String user_name;
	
	@Column
	@NotEmpty(message = "Email is Required")
	@Email
	private String email;
	
	@Column
	@NotEmpty(message = "Password is Required")
	private String password;
	
	@Column
	@NotEmpty(message = "Role is Required")
	private String role;
	
	@Column
	@NotEmpty(message = "Mobile number is Required")
	private String mobile;
	
	@Column
	@NotEmpty(message = "Address is Required")
	private String address;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "booking_details_id")
	private BookingDetails bookingDetails;
	
	public User() 
	{
		
	}


	public User(Integer user_id, String user_name, String email, String password, String role, String mobile,BookingDetails bookingDetails,
			String address) {
		this.user_id = user_id;
		this.user_name = user_name;
		this.email = email;
		this.password = password;
		this.role = role;
		this.mobile = mobile;
		this.address = address;
		this.bookingDetails = bookingDetails;
	}

	

	public User( String user_name, String email, String password, String role, String mobile, 
			String address, BookingDetails bookingDetails) {
		this.user_name = user_name;
		this.email = email;
		this.password = password;
		this.role = role;
		this.mobile = mobile;
		this.address = address;
		this.bookingDetails = bookingDetails;
	}


	public Integer getUser_id() {
		return user_id;
	}


	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}


	public String getUser_name() {
		return user_name;
	}


	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public BookingDetails getBookingDetails() {
		return bookingDetails;
	}


	public void setBookingDetails(BookingDetails bookingDetails) {
		this.bookingDetails = bookingDetails;
	}
	
	
	
	
}


