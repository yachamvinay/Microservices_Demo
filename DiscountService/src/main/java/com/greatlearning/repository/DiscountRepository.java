package com.greatlearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.entity.DiscountEntity;

public interface DiscountRepository extends JpaRepository<DiscountEntity, Long> {

}
