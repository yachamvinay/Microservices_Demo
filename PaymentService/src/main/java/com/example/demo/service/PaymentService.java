package com.example.demo.service;

 
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.PayementEntity;
import com.example.demo.repository.PaymentRepository;
 

@Service
public class PaymentService {

	   @Autowired
	    private PaymentRepository repository;
	   public PayementEntity doPayment(PayementEntity payment)   {
		   payment.setPaymentStatus(paymentProcessing());
	        payment.setTransactionId(UUID.randomUUID().toString());
	  
	        return repository.save(payment);
	    }
	   
	    public String paymentProcessing(){
	        //api should be 3rd party payment gateway (paypal,paytm...)
	        return new Random().nextBoolean()?"success":"false";
	    }
	    public PayementEntity findPaymentHistoryByOrderId(int orderId) {
	    	PayementEntity payment=repository.findByOrderId(orderId);
	      
	        return payment ;
	    }
}
