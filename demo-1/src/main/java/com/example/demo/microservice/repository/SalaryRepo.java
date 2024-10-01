package com.example.demo.microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.microservice.entity.Salary;

@Repository
public interface SalaryRepo extends JpaRepository<Salary, Integer> {

Salary findByCode(int code);
}
