package com.example.Transactions.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Transactions.entity.Transactions;
@Repository
public interface ITransactionsRepository extends JpaRepository<Transactions,Integer>
{
	
}