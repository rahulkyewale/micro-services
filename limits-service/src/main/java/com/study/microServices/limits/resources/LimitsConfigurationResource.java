package com.study.microServices.limits.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.microServices.limits.model.Configuration;
import com.study.microServices.limits.model.LimitConfiguration;

@RestController
public class LimitsConfigurationResource {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfigurations() {
		LimitConfiguration limitConfiguration = new LimitConfiguration(configuration.getMinimum(), configuration.getMaximum());
		return limitConfiguration;
	}
}
