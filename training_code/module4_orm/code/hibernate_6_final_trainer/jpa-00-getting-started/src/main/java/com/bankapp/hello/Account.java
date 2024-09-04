package com.bankapp.hello;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor

@Entity
@Table(name = "account_table_sunlife_2")
 public class Account {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY )
    @Column(name = "account_id")
    private Integer id;
    @Column(name = "account_holder_name", nullable = false, length = 100)
    private String name;
    //XXXXXX.44
    @Column(name="account_balance", nullable = false,precision = 12, scale = 2)
    private BigDecimal balance;

    @Column(name = "account_holder_phone_number", nullable = false, length = 12)
    private String phoneNumber;



    public Account(String name, BigDecimal balance) {
        this.name = name;
        this.balance = balance;
    }

   public Account(String name, BigDecimal balance, String phoneNumber) {
      this.name = name;
      this.balance = balance;
      this.phoneNumber=phoneNumber;
   }

}
