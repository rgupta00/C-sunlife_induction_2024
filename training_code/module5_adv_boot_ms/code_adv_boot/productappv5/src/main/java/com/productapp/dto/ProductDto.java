package com.productapp.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;
import org.springframework.hateoas.RepresentationModel;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto extends RepresentationModel<ProductDto> {
		private Integer id;
		@NotEmpty(message = "{productDto.name.absent}")
		@Pattern(regexp = "[A-Za-z]+( [A-Za-z]+)*",
				message = "{productDto.name.invalid}")
		private String name;

		@NotNull(message = "{productDto.price.absent}")
		@Range(min = 100, max = 100000, message = "{productDto.price.invalid}")
		private BigDecimal price;

	public ProductDto(String name, BigDecimal price) {
		this.name = name;
		this.price = price;
	}
}