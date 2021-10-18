package com.example.Transactions.entity;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;


@Entity
@Table
public class Transactions 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer transaction_id;
	@Column
	@Min(value=1,message="Please enter the amount")
	private Double amount;
    
//	@OneToOne(cascade=CascadeType.ALL)
	//@JoinColumn(name="payment_id")
	//private Payment payment;

public Transactions()
{
	
}

public Transactions(Integer transaction_id,Double amount)
{
	
	super();
	this.transaction_id= transaction_id;
	this.amount = amount;
}
public Transactions(Double amount)
{
	
	super();
	this.amount = amount;
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
}