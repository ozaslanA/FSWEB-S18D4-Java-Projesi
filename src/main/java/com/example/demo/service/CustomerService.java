package com.example.demo.service;

import com.example.demo.entity.Adress;
import com.example.demo.entity.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> findAll();

    Customer find (long id);

    Customer save(Customer customer);

    Customer delete(long id);

}
