package com.appointment;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {
	
	@Autowired
	AppointmentDAOService daoService;
	
	public List<Appointment> getAppointments(String key) {
		 List<Appointment> appointments = new ArrayList<>();
		 daoService.findAll().
				 forEach(appointments::add);
		 return appointments;
	}
	
	public Boolean createAppointment(Appointment appointment) {
		appointment.setId(daoService.count()+1);
		daoService.save(appointment);
		return true;
	}
	
	public Boolean deleteAppointment(long id) {
		 daoService.deleteById(id);
		 return true;
	}
	
	public Boolean updateAppointment(long id, Appointment appointment) {
		 daoService.save(appointment);
		 return true;
	}
}
