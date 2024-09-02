package com.bankapp.hello2;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor

@Entity
@Table(name = "account_table_more_annotations")
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

    @Temporal(TemporalType.DATE)
    @Column(name ="account_creation_date" )
    private Date accountCreationDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name ="account_last_login_time_stamp" )
    private Date lastLoginTimeStamp;

    @Transient //hey hib ignore it dont store this field to db
    private String tempPassword;



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
