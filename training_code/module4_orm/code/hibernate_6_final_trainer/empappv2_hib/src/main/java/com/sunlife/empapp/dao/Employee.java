package com.sunlife.empapp.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//DTO
@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "emp_again")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private double salary;
	
	public Employee( String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

}
