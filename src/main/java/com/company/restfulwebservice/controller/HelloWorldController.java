package com.company.restfulwebservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.restfulwebservice.model.Hello;

@RestController
public class HelloWorldController {
	
	
	
	@GetMapping("/hello/saravana")
	public ResponseEntity<Hello> displayMessage(){		
		Hello he = new Hello("Welcome Saravana");		
		return ResponseEntity.ok(he);		
	} 
	
	

}
