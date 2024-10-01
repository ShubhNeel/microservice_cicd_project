package com.example.demo.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.microservice.entity.Salary;
import com.example.demo.microservice.service.SalaryService;

@RestController
public class SalaryController {
	
	@Autowired
	SalaryService salaryService;
	
	@GetMapping(value = "/salary/{code}", produces = "application/json")
	public ResponseEntity<Salary> getSalaryDetails(@PathVariable("code") int code) {
		System.out.println("Hello Controller");
		return ResponseEntity.ok().body(salaryService.getSalByCode(code));
		
		
	}

}
