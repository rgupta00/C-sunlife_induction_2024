package com.bankapp.hello;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

/*
 * TODO apply JPA annotations
 */
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
 public class Account {

   
    private Integer id;

    
    private String name;
    //XXXX.44
    
    private BigDecimal balance;

   public Account(String name, BigDecimal balance) {
      this.name = name;
      this.balance = balance;
   }
}
