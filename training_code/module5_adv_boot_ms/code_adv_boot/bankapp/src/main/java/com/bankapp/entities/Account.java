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
@Table(name = "account_table")
public class Account {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private BigDecimal balance;
    private String email;
    private String phone;


    public Account(String name, BigDecimal balance, String email, String phone) {
        this.name = name;
        this.balance = balance;
        this.email = email;
        this.phone = phone;
    }
}
