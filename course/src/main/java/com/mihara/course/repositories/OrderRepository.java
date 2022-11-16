package com.mihara.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mihara.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
