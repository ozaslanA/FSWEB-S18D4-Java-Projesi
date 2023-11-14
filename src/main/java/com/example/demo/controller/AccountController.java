package com.example.demo.controller;

import com.example.demo.entity.Account;
import com.example.demo.service.AccountService;
import com.example.demo.service.CustomerService;
import com.example.demo.util.EntityConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {


    private AccountService accountService;


    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/")
   public List<Account> findAll(){
        return accountService.findAll();
    }


    @GetMapping("/{id}")

    public Account find(@PathVariable long id){
        return accountService.find(id);
    }

    @PostMapping("/")
    public Account save(@RequestBody Account account){
        return accountService.save(account);
    }

    @PutMapping("/{id}")
    public Account update(@RequestBody Account account, @PathVariable long id){
        Account aaAccount=accountService.find(id);
        if(aaAccount != null){
            account.setId(id);
            return accountService.save(account);
        }
        return null;
    }
    @DeleteMapping("/{id}")
    public Account (@PathVariable long id){
        return EntityConverter.findResult(C)
    }

}
