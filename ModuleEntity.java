package com.example.Module.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ModuleEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private  Integer hid;
	@Column
	private String   city;
	@Column
	private String  hname;
	@Column
	private String  adrress;
	@Column
	private String  discription;
	@Column
	private Double avg_rate_per_day;
	@Column
	private String  email;
	@Column
	private String  phone1;
	@Column
	private String  phone2;
	@Column
	private String  website;
	public ModuleEntity() {
		super();
	}
	public ModuleEntity(Integer hid, String city, String hname, String adrress, String discription,
			Double avg_rate_per_day, String email, String phone1, String phone2, String website) {
		
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
