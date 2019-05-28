package com.bcs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bcs.entity.UserTicket;

public interface UserTicketRepository extends JpaRepository<UserTicket, Integer> {

}
