package com.bcs.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcs.dto.UserTicketDto;
import com.bcs.entity.MasterIncident;
import com.bcs.entity.User;
import com.bcs.entity.UserTicket;
import com.bcs.repository.MasterIncidentRepository;
import com.bcs.repository.UserRepository;
import com.bcs.repository.UserTicketRepository;

@Service
public class BcsServiceImpl implements BcsService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	UserTicketRepository userTicketRepository;

	@Autowired
	MasterIncidentRepository masterIncidentRepository;

	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();
	}

	@Override
	public List<MasterIncident> getIncidentType() {
		return masterIncidentRepository.findAll();
	}

	public UserTicket createIncident(UserTicketDto userTicketDto) {

		UserTicket userTicket = new UserTicket();

		userTicket.setIncidentType(userTicketDto.getIncidentType());
		userTicket.setUserName(userTicketDto.getUserName());
		userTicket.setCreationTime(new Date());
		userTicket.setContactNumber(userTicketDto.getContactNumber());
		userTicket.setIncidentDescription(userTicketDto.getIncidentDescription());
		userTicket.setSeverity(userTicketDto.getSeverity());

		UserTicket userData = userTicketRepository.save(userTicket);

		return userData;

	}

	@Override
	public List<UserTicket> getAllIncident() {
		return userTicketRepository.findAll();
	}

}
