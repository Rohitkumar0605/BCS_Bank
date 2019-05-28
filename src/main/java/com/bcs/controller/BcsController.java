package com.bcs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bcs.dto.UserTicketDto;
import com.bcs.entity.MasterIncident;
import com.bcs.entity.User;
import com.bcs.entity.UserTicket;
import com.bcs.service.BcsService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BcsController {

	@Autowired
	BcsService bcsService;

	@GetMapping(path = "/getAllUser")
	public List<User> getAllUsers() {
		return bcsService.getAllUser();
	}

	@GetMapping(path = "/getIncidentType")
	public List<MasterIncident> getIncidentType() {
		return bcsService.getIncidentType();
	}

	@PostMapping("/createIncident")
	public UserTicket createIncident(@RequestBody UserTicketDto userTicketDto) {
		UserTicket userTicket = bcsService.createIncident(userTicketDto);
		return userTicket;
	}

	@GetMapping("/getAllIncidentDetails")
	public List<UserTicket> getAllIncidentDetails() {
		return bcsService.getAllIncident();
	}

}
