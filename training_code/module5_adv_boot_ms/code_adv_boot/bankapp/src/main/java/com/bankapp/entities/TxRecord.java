package com.bankapp.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString

@Entity
@Table(name = "tx_record_table")
public class TxRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer fromAccNumber;
    private Integer toAccountNumber;
    private BigDecimal amount;
    private String authorityName;
    private String txStatus;

    public TxRecord(Integer fromAccNumber, Integer toAccountNumber,
                    BigDecimal amount, String authorityName,
                    String txStatus) {
        this.fromAccNumber = fromAccNumber;
        this.toAccountNumber = toAccountNumber;
        this.amount = amount;
        this.authorityName = authorityName;
        this.txStatus = txStatus;
    }
}
