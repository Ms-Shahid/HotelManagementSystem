package com.cg.hbm.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Payments {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer payment_id;
	@Column
	private Integer booking_id;
	@Column
	private Integer transaction_id;
	
	public Payments() {
		
	}
	
	public Payments(Integer payment_id, Integer booking_id, Integer transaction_id) {
		this.payment_id = payment_id;
		this.booking_id = booking_id;
		this.transaction_id = transaction_id;
	}

	public Integer getPayment_id() {
		return payment_id;
	}

	public void setPayment_id(Integer payment_id) {
		this.payment_id = payment_id;
	}

	public Integer getBooking_id() {
		return booking_id;
	}

	public void setBooking_id(Integer booking_id) {
		this.booking_id = booking_id;
	}

	public Integer getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(Integer transaction_id) {
		this.transaction_id = transaction_id;
	}
	
}
