package com.example.Module.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;


@Entity
public class Hotel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer hid;
	
	@Column
	@NotEmpty(message = "Hotel City is Required")
    private String city;
	
	@Column
	@NotEmpty(message = "Hotel Name is Required")
    private String hname;
	
	@Column
	@NotEmpty(message = "Hotel Address is Required")
    private String adrress;
	
	@Column
	@NotEmpty(message = "Hotel Discription is Required")
    private String discription;
	
	@Column
	@Min(value=1, message="Enter the avg_rate_per_day")
	private Double avg_rate_per_day;
	
	@Column
	@Email
	@NotEmpty(message = "Hotel Email is Required")
	private String email;
	
    @Column
	@NotEmpty(message = "Hotel Phone1 Number is Required")
    private String phone1;
    
	@Column
	@NotEmpty(message = "Hotel Phone2 Number is Required")
    private String phone2;
	
	@Column
	@NotEmpty(message = "Hotel Website is Required")
    private String website;

	public Hotel() {
		super();
	}

	public Hotel(Integer hid, String city, String hname, String adrress, String discription, Double avg_rate_per_day,
			String email, String phone1, String phone2, String website) {

		this.hid = hid;
		this.city = city;
		this.hname = hname;
		this.adrress = adrress;
		this.discription = discription;
		this.avg_rate_per_day = avg_rate_per_day;
		this.email = email;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.website = website;
	}

	public Integer getHid() {
		return hid;
	}

	public void setHid(Integer hid) {
		this.hid = hid;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getHname() {
		return hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

	public String getAdrress() {
		return adrress;
	}

	public void setAdrress(String adrress) {
		this.adrress = adrress;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public Double getAvg_rate_per_day() {
		return avg_rate_per_day;
	}

	public void setAvg_rate_per_day(Double avg_rate_per_day) {
		this.avg_rate_per_day = avg_rate_per_day;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

}
