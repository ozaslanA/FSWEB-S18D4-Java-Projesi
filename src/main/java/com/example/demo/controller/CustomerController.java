package com.example.demo.controller;

import com.example.demo.dto.CustomerResponse;
import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;
import com.example.demo.util.EntityConverter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/")
    List<CustomerResponse> findAll(){
        return EntityConverter.findResult(customerService.findAll());
    }

    @GetMapping("/{id}")
    public CustomerResponse find(@PathVariable long id){
        return  EntityConverter.findResult(customerService.find(id));
    }

    @PostMapping("/")
    public CustomerResponse save(@RequestBody Customer customer){
        return  EntityConverter.findResult(customerService.save(customer));
    }

    @PutMapping("/{id}")
    public CustomerResponse update(@RequestBody Customer customer,@PathVariable long id){
        Customer fcustomer=customerService.find(id);
        if(fcustomer !=null){
            fcustomer.setId(id);

        }
        return null;
    }


    @DeleteMapping("/{id}")
    public CustomerResponse delete(@PathVariable long id){
      return    EntityConverter.findResult(customerService.delete(id));
    }
}
