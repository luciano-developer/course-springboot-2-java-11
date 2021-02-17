package com.demospring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demospring.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {

}
