package com.cg.hbm.entities;

import javax.persistence.Column;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;


@Entity
@Table(name="room_Details")
public class RoomDetails
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer room_id;
	@Column
	@Min(value =1, message ="Enter valid hotel_id")
	private Integer hotel_id;
	@Column
	@NotEmpty(message ="Room No is Required")
	private String room_no;
	
	@Column
	@NotEmpty(message ="Room_Type is Required")
	private String room_type;
	@Column
	@Min(value=1,message =" Enter valid Rate_per_Day ")
	private Double  rate_per_day;
	@Column
	private Boolean isAvailable;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="un_fk",referencedColumnName="hotel_id")
	private RoomDetails roomDetails;
	
	public RoomDetails()
	{
		
	}
	public RoomDetails(Integer room_id, Integer hotel_id, String room_no, String room_type,Double rate_per_day, Boolean isAvailable) 
	{
		super();
		this.room_id = room_id;
		this.hotel_id = hotel_id;
		this.room_no = room_no;
		this.room_type = room_type;
		this.rate_per_day = rate_per_day;
		this.isAvailable = isAvailable;
	}
     public RoomDetails(Integer hotel_id, String room_no, String room_type,Double rate_per_day, Boolean isAvailable) 
	{
		super();
		this.hotel_id = hotel_id;
		this.room_no = room_no;
		this.room_type = room_type;
		this.rate_per_day = rate_per_day;
		this.isAvailable = isAvailable;
	}





public int getRoom_id() {
	return room_id;
}

public void setRoom_id(int room_id) {
	this.room_id = room_id;
}

public int getHotel_id() {
	return hotel_id;
}

public void setHotel_id(int hotel_id) {
	this.hotel_id = hotel_id;
}

public String getRoom_no() {
	return room_no;
}

public void setRoom_no(String room_no) {
	this.room_no = room_no;
}

public String getRoom_type() {
	return room_type;
}

public void setRoom_type(String room_type) {
	this.room_type = room_type;
}

public double getRate_per_day() {
	return rate_per_day;
}

public void setRate_per_day(double rate_per_day) {
	this.rate_per_day = rate_per_day;
}

public boolean isAvailable() {
	return isAvailable;
}

public void setAvailable(boolean isAvailable) {
	this.isAvailable = isAvailable;
}

//public Blob getPhoto() {
	//return photo;
//}

//public void setPhoto(Blob photo) {
	//this.photo = photo;
//}

 
}