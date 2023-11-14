package com.example.demo.dto;

public record AccountResponse(long id,String accountName,String moneyAmmount,CustomerResponse customerResponse) {
}
