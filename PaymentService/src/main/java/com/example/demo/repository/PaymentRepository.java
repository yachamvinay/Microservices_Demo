package com.example.demo.repository;

 
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.PayementEntity;
 
 
public interface PaymentRepository extends JpaRepository<PayementEntity,Integer> {
	PayementEntity findByOrderId(int orderId);
	 
}
