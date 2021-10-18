package com.cg.hbm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.hbm.entities.Payments;
import com.cg.hbm.repository.IPaymentRepository;

@Service
public class IPaymentServiceImpl implements IPaymentService{

	@Autowired
	IPaymentRepository paymentRepository;
	
	@Override
	public Payments addPayment(Payments payment) {
		Payments pay = paymentRepository.save(payment);
		return pay;
	}
}
