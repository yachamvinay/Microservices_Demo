package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.common.TransactionRequest;
import com.example.demo.common.TransactionResponse;
import com.example.demo.service.OrderService;

@RestController 
@RequestMapping("/order")
public class OrderController {
	
	
    @Autowired
    private OrderService service;
    
    @PostMapping("/bookOrder")
  /*  public Order bookOrder(@RequestBody Order order)
    {
    	return service.saveOrder(order);
    }*/
    
    public TransactionResponse bookOrder(@RequestBody TransactionRequest request) {
        return service.saveOrder(request);
    }

	@GetMapping("order-now/{price}")
	public String orderNow(@PathVariable long price)
	{
		return "Hi vinay, your order is placed succefully with amount :"+price;
	}

}
