package com.cg.hbm.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RoomDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer room_id;
	@Column
	private Integer hotel_id;
	@Column
	private String room_no;
	@Column
	private String room_type;
	@Column
	private Double rate_per_day;
	@Column
	private Boolean isAvailable;
	//private Blob photo;
	
	public RoomDetails() {
		
	}
	
	public RoomDetails(Integer room_id, Integer hotel_id, String room_no, String room_type,Double rate_per_day,
			Boolean isAvailable) {
		this.room_id = room_id;
		this.hotel_id = hotel_id;
		this.room_no = room_no;
		this.room_type = room_type;
		this.rate_per_day = rate_per_day;
		this.isAvailable = isAvailable;
	}

	public Integer getRoom_id() {
		return room_id;
	}

	public void setRoom_id(Integer room_id) {
		this.room_id = room_id;
	}

	public Integer getHotel_id() {
		return hotel_id;
	}

	public void setHotel_id(Integer hotel_id) {
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

	public Double getRate_per_day() {
		return rate_per_day;
	}

	public void setRate_per_day(Double rate_per_day) {
		this.rate_per_day = rate_per_day;
	}

	public Boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
}
