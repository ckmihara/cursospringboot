package com.mihara.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mihara.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
