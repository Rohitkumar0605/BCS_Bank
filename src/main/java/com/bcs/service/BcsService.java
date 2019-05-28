package com.bcs.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.bcs.entity.User;
import com.bcs.entity.UserTicket;

@Service
public interface BcsService {

	public List<User> getAllUser();

	public List<UserTicket> getAllIncident();

}
