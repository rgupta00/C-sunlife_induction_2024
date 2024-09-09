package com.bankapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransferDto {
    private Integer fromAccountId;
    private Integer toAccountId;
    private BigDecimal amount;
}
