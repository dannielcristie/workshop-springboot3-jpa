package com.springbootcourse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootcourse.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
