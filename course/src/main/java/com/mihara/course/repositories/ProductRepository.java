package com.mihara.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mihara.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
