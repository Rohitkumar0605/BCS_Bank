package com.bcs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bcs.entity.MasterIncident;
import com.bcs.entity.User;

@Service
public interface BcsService {
	
	
	public List<User> getAllUser();

	public List<MasterIncident> getIncidentType();

}
