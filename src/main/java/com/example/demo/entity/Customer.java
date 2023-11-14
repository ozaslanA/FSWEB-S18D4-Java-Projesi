package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name="customer",schema="fsweb")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    @Column(name="first_name")
    private String firstname;

    @Column(name="last_name")
    private String lastname;

    @Column(name="email")
    private String email;

    @Column(name="salary")
    private  double salary;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="adress_id")
    private Adress adress;



    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)

    private List<Account> accountList = new ArrayList<>();
}
