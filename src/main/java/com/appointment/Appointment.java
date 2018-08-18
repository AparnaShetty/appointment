package com.appointment;

import javax.persistence.Entity;
import javax.persistence.Id;

//Apointment Pojo
@Entity
public class Appointment
{
	@Id
	private long id;
	private String date;
    private String time;
    private String description;
    
    public Appointment()
    {
    	
    }
    
    public Appointment(String date, String time, String description)
    {
    	this.date = date;
    	this.time = time;
    	this.description = description;
    }
    
    public String getDate()
    {
        return date;
    }
    public void setDate(String date)
    {
        this.date = date;
    }
    public String getTime()
    {
        return time;
    }
    public void setTime(String time)
    {
        this.time = time;
    }
    public String getDescription()
    {
        return description;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }
    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
