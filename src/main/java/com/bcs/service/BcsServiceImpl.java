package com.bcs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcs.entity.MasterIncident;
import com.bcs.entity.User;
import com.bcs.repository.MasterIncidentRepository;
import com.bcs.repository.UserRepository;


@Service
public class BcsServiceImpl implements BcsService {

	@Autowired
	UserRepository userRepository;
	
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

}
