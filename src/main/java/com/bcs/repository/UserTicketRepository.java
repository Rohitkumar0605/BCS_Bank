package com.bcs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bcs.entity.UserTicket;

@Repository
public interface UserTicketRepository extends JpaRepository<UserTicket, Integer> {

}
