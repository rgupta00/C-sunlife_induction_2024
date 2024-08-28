package com.dp.creational.object_class_java;

import java.util.Date;
import java.util.Objects;

class Employee extends Object{
	private Integer id;
	private String name;
	private Date hireDay;//mutable

	public Employee(Integer id, String name, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.hireDay=date;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getHireDay() {
		return hireDay;
	}

	public void setHireDay(Date hireDay) {
		this.hireDay = hireDay;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", hireDay=" + hireDay + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(hireDay, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(hireDay, other.hireDay) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name);
	}

	
}







