package com.appointment;

import org.springframework.data.repository.CrudRepository;

public interface AppointmentDAOService extends CrudRepository<Appointment, Long> {
}
