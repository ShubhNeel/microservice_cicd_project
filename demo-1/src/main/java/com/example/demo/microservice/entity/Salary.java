package com.example.demo.microservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "salary")
public class Salary {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "salary_amt")
	private int salaryAmount;

	@Column(name = "code")
	private int code;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalaryAmount() {
		return salaryAmount;
	}

	public void setSalaryAmount(int salaryAmount) {
		this.salaryAmount = salaryAmount;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Salary [id=" + id + ", salaryAmount=" + salaryAmount + ", code=" + code + "]";
	}

}
