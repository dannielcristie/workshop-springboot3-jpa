package com.springbootcourse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootcourse.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
