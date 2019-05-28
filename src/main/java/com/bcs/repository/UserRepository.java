package com.bcs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bcs.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
