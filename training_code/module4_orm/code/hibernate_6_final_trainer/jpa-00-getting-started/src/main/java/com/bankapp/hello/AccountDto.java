package com.bankapp.hello;

import java.math.BigDecimal;
//dto
public record AccountDto(String name, BigDecimal balance) {
}
