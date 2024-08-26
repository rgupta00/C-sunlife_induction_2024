package com.bankapp.basics3;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
 * TODO apply JPA annotations
 */
@Data
@NoArgsConstructor

@ToString
@EqualsAndHashCode

public class Customer {
	
	private  Integer id;
	private String name;
	private String mobile;

	private List<String> emails=new ArrayList<>();

	public Customer(String name, String mobile) {
		this.name = name;
		this.mobile = mobile;
	}
	public void addEmail(String email){
		emails.add(email);
	}
}
