package com.bankapp.repo;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Account {
    private int id;
    private String name;
    private double balance;

}
