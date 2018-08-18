package com.appointment;

import org.springframework.data.repository.CrudRepository;
//CRUD operation
public interface AppointmentDAOService extends CrudRepository<Appointment, Long> {
}
