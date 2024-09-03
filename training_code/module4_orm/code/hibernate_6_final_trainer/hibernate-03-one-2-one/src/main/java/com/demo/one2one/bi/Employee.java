package com.demo.one2one.bi;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Entity
@Table(name = "e_table")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	private String empName;

	@JoinColumn(name = "pid_fk", nullable = false)
	@OneToOne
	private Parking parking;

	public Employee(String empName) {
		this.empName = empName;
	}
}
