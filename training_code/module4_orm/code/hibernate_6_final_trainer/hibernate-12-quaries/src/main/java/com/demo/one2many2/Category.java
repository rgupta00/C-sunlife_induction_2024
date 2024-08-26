package com.demo.one2many2;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "cat_table_quaries")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cid;
    private String name;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private Set<Product> products=new HashSet<>();

    public Category(String name) {
        this.name = name;
    }
}