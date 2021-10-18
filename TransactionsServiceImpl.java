package com.example.Transactions.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Transactions.entity.Transactions;
import com.example.Transactions.repository.ITransactionsRepository;
 
@Service
public class TransactionsServiceImpl implements ITransactionsService
{



@Autowired
private ITransactionsRepository transactionsrepository;

@Override
public Transactions addTransaction(Transactions transaction) {
	return  transactionsrepository.save(transaction) ;
}
	}
