package com.example.demo.microservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.microservice.entity.Salary;
import com.example.demo.microservice.repository.SalaryRepo;

@Service
public class SalaryService {

	@Autowired
	private SalaryRepo salaryRepo;

	public Salary getSalByCode(int code) {
		System.out.println("Hello Service");
		return salaryRepo.findByCode(code);

	}

}
