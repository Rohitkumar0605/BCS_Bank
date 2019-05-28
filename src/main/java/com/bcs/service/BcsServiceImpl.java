package com.bcs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcs.entity.User;
import com.bcs.entity.UserTicket;
import com.bcs.repository.UserRepository;
import com.bcs.repository.UserTicketRepository;

@Service
public class BcsServiceImpl implements BcsService {

	@Autowired
	UserRepository userRepository;
	UserTicketRepository userTicketRepository;

	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();
	}

	@Override
	public List<UserTicket> getAllIncident() {
		return userTicketRepository.findAll();
	}

}
