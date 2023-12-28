package com.ticketapp.core.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.ticketapp.core.application.domain"}) 
public class TicketappApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketappApplication.class, args);
	}
}
