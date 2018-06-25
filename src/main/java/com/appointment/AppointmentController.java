package com.appointment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AppointmentController
{

	@Autowired 
	AppointmentService appointmentService;
	
    @RequestMapping(value = "/appointment", method = RequestMethod.GET)
    public List<Appointment> getAppointments(
            @RequestParam(required = false) String key)
    {
    	return appointmentService.getAppointments(key);
    }
    
    @RequestMapping(value = "/appointment", method = RequestMethod.POST)
    public boolean createAppointment(@RequestBody Appointment appointment)
    {
    	return appointmentService.createAppointment(appointment);
    }
    
    @RequestMapping(value = "/appointment/{id}", method = RequestMethod.PUT)
    public boolean updateAppointment(
    		@RequestBody Appointment appointment,
            @PathVariable(required = true) long id)
    {
    	return appointmentService.updateAppointment(id, appointment);
    }
    
    @RequestMapping(value = "/appointment/{id}", method = RequestMethod.DELETE)
    public boolean deleteAppointment(
            @PathVariable(required = true) long id)
    {
    	return appointmentService.deleteAppointment(id);
    }
}
