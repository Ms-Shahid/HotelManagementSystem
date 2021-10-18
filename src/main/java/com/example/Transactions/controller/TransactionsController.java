package com.example.Transactions.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Transactions.entity.Transactions;
import com.example.Transactions.service.ITransactionsService;


@RestController
@RequestMapping(value="/room_Details")
public class TransactionsController 
{
	@Autowired
	private ITransactionsService transactionsService;
	
	@PostMapping(value="/add")
  public ResponseEntity<Transactions> saveTransactions(@Valid @RequestBody Transactions transactions)
	{
		return new ResponseEntity<Transactions>(transactionsService.addTransaction(transactions),HttpStatus.CREATED);
	}
}