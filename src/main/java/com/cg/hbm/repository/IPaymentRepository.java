package com.cg.hbm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.hbm.entities.Payments;

@Repository
public interface IPaymentRepository extends JpaRepository<Payments, Integer>{

}
