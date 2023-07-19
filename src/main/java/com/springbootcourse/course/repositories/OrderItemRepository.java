package com.springbootcourse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootcourse.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
	

}
