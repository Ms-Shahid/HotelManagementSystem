package com.cg.hbm.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.hbm.entities.Payments;
import com.cg.hbm.service.IPaymentService;

@RestController
@RequestMapping(value="/payment")
public class PaymentController {

	@Autowired
	private IPaymentService paymentService;
	
	
	@PostMapping(value="/payment/save")
	public ResponseEntity<Payments> addPayment(@Valid @RequestBody Payments payment){
		Payments savePayment = paymentService.addPayment(payment);
		return new ResponseEntity<Payments>(savePayment,HttpStatus.CREATED);
	}
}
