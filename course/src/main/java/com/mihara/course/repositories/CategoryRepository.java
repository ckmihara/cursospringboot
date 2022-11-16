package com.mihara.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mihara.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
