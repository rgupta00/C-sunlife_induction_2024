package com.bankapp.basics3;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor

@ToString
@EqualsAndHashCode
@Entity
@Table(name = "customer_table_2")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Integer id;
	private String name;
	private String mobile;

	@ElementCollection(fetch = FetchType.LAZY)
	@CollectionTable(name = "customer_emails")
	private List<String> emails=new ArrayList<>();

	public Customer(String name, String mobile) {
		this.name = name;
		this.mobile = mobile;
	}
	public void addEmail(String email){
		emails.add(email);
	}
}
