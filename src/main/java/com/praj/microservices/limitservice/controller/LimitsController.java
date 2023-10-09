package com.praj.microservices.limitservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import com.praj.microservices.limitservice.configuration.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.praj.microservices.limitservice.beans.Limits;

@RestController
public class LimitsController {

	@Autowired
	private Configuration config;
	
	@GetMapping("/limits")
	public Limits getLimits() {
		//return new Limits(1, 1000);
		return new Limits(config.getMinimum(), config.getMaximum());
	}
}
