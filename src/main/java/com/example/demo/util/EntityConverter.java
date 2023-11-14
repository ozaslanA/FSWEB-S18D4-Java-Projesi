package com.example.demo.util;

import com.example.demo.dto.CustomerResponse;
import com.example.demo.entity.Customer;

import java.util.ArrayList;
import java.util.List;

public class EntityConverter {
    public static List<CustomerResponse> findResult(List<Customer> customers){
        List<CustomerResponse> customerResponses=new ArrayList<>();
        for(Customer customer:customers){
            customerResponses.add(new CustomerResponse(customer.getId(),
                    customer.getEmail(),customer.getSalary()));

        }
  return customerResponses;
}


    public static CustomerResponse findResult(Customer customer){
        return new CustomerResponse(customer.getId(),customer.getEmail(),customer.getSalary());

    }


} 