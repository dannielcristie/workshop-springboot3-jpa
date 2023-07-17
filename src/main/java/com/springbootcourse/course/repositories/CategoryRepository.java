package com.springbootcourse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootcourse.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
