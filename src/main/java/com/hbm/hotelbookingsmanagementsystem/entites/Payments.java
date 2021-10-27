package com.hbm.hotelbookingsmanagementsystem.entites;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity

public class Payments {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer payment_id;
	@Column
	@Min(1)
	@NotNull(message = "Please provide booking id")
	private Integer booking_id;
	@Column
	@Min(1)
	@NotNull(message = "Please provide transaction id")
	private Integer transaction_id;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "booking", referencedColumnName = "booking_id")
	@JsonIgnore
	private BookingDetails bookingDetails;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "payment")

	private Transactions transactions;

	public Transactions getTransactions() {
		return transactions;
	}

	public void setTransactions(Transactions transactions) {
		this.transactions = transactions;
	}

	public Payments() {

	}

	public Payments(Integer payment_id, Integer booking_id, Integer transaction_id, Transactions transaction) {

		this.payment_id = payment_id;
		this.booking_id = booking_id;
		this.transaction_id = transaction_id;

	}

	public Payments(Integer booking_id, Integer transaction_id) {

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

	public BookingDetails getBookingDetails() {
		return bookingDetails;
	}

	public void setBookingDetails(BookingDetails bookingDetails) {
		this.bookingDetails = bookingDetails;
	}

}
