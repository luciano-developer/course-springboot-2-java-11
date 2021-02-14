package com.demospring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demospring.course.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
