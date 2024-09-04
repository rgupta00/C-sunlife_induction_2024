package com.productapp.repo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product_table_boot")
public class Product {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
		private String name;
		private BigDecimal price;
}