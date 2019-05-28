package com.bcs.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.bcs.dto.UserTicketDto;
import com.bcs.entity.MasterIncident;
import com.bcs.entity.User;
import com.bcs.entity.UserTicket;
import com.bcs.repository.MasterIncidentRepository;
import com.bcs.repository.UserRepository;
import com.bcs.repository.UserTicketRepository;

import junit.framework.Assert;

@RunWith(MockitoJUnitRunner.class)
public class BcsServiceImplTest {

	@Mock
	UserTicketRepository userTicketRepository;

	@Mock
	UserRepository userRepository;

	@Mock
	MasterIncidentRepository masterIncidentRepository;

	@InjectMocks
	BcsServiceImpl bcsServiceImpl;
	static UserTicket userTicket = new UserTicket();
	static User user = new User();
	static List<User> expectval1 = new ArrayList<User>();
	static List<MasterIncident> expectval2 = new ArrayList<MasterIncident>();
	static MasterIncident masterIncident = new MasterIncident();
	static List<UserTicket> expectval3 = new ArrayList<UserTicket>();
	static UserTicket usertic = new UserTicket();
	static UserTicketDto userTicketDto = new UserTicketDto();

	@BeforeClass
	public static void setUp() {

		user.setUserId(1L);
		user.setUserName("xyz");
		expectval1.add(user);

		masterIncident.setId(1L);
		masterIncident.setIncidentType("abc");
		masterIncident.setSeverity("P1");
		expectval2.add(masterIncident);

		userTicket.setContactNumber(123);
		userTicket.setCreationTime(null);
		userTicket.setIncidentDescription("xyz");
		userTicket.setIncidentType("asd");
		userTicket.setSeverity("P1");
		userTicket.setTransactionId(12);
		userTicket.setUserName("xyz");
		expectval3.add(userTicket);

		userTicketDto.setContactNumber(123);
		userTicketDto.setCreationTime(null);
		userTicketDto.setIncidentDescription("xyz");
		userTicketDto.setIncidentType("abc");
		userTicketDto.setSeverity("p1");
		userTicketDto.setUserName("zxc");

		usertic.setContactNumber(userTicketDto.getContactNumber());
		usertic.setCreationTime(userTicketDto.getCreationTime());
		usertic.setIncidentDescription(userTicketDto.getIncidentDescription());
		usertic.setIncidentType(userTicketDto.getIncidentType());
		usertic.setSeverity(userTicketDto.getSeverity());
		usertic.setTransactionId(1);
		usertic.setUserName(userTicketDto.getUserName());

	}

	@Test
	public void testGetAllIncident() {
		Mockito.when(userTicketRepository.findAll()).thenReturn(expectval3);
		List<UserTicket> actval3 = bcsServiceImpl.getAllIncident();
		Assert.assertEquals(expectval3.size(), actval3.size());

	}

	@Test
	public void testGetAllUser() {
		Mockito.when(userRepository.findAll()).thenReturn(expectval1);
		List<User> actval1 = bcsServiceImpl.getAllUser();
		Assert.assertEquals(expectval1.size(), actval1.size());
	}

	@Test
	public void testGetIncidentType() {
		Mockito.when(masterIncidentRepository.findAll()).thenReturn(expectval2);
		List<MasterIncident> actval2 = bcsServiceImpl.getIncidentType();
		Assert.assertEquals(expectval2.size(), actval2.size());

	}

	@Test
	public void testCreateIncident() {
		Mockito.when(userTicketRepository.save(usertic)).thenReturn(usertic);
		UserTicket actval3 = bcsServiceImpl.createIncident(userTicketDto);
		Assert.assertEquals(usertic, actval3);
	}

}
