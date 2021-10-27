package com.hbm.hotelbookingsmanagementsystem.entites;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity

public class Transactions {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer transaction_id;
	@Column
	@Min(value = 1)
	@NotNull(message = "Please enter the amount")
	private Double amount;

	@OneToOne
	@JoinColumn(name="payment", referencedColumnName = "payment_id")
	@JsonIgnore
	private Payments payment;

	public Transactions() {

	}

	public Transactions(Integer transaction_id, Double amount, Payments payment) {
		this.transaction_id = transaction_id;
		this.amount = amount;
		this.payment = payment;
	}

	public Transactions(Double amount,Payments payment) {
		this.amount = amount;
		this.payment = payment;
	}

	public int getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Payments getPayment() {
		return payment;
	}

	public void setPayment(Payments payment) {
		this.payment = payment;
	}
	
	
}
