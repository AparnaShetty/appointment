package com.appointment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/search")
public class AppointmentViewController {
	
	 @GetMapping
	 public String showView()
	 {
	    return "search";
	 }	 
}