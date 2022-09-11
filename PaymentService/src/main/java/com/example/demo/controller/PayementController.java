package com.example.demo.controller;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.PayementEntity;
import com.example.demo.service.PaymentService;
 
@RestController
@RequestMapping("/payement")
public class PayementController {
	
    @Autowired
    private PaymentService service;
    @PostMapping("/doPayment")
    public PayementEntity doPayment(@RequestBody PayementEntity payment) {
        return service.doPayment(payment);
    }
    
    @GetMapping("/{orderId}")
    public PayementEntity findPaymentHistoryByOrderId(@PathVariable int orderId){
              return service.findPaymentHistoryByOrderId(orderId);
    }

	@GetMapping("/paynow")
	public String orderNow()
	{
		return "Hi Your payment succefull";
	}


}
