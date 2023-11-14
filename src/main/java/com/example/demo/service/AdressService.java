package com.example.demo.service;

import com.example.demo.entity.Adress;
import org.springframework.stereotype.Service;

import java.util.List;
public interface AdressService {
    List<Adress> findAll();

    Adress find(long id);

    Adress save(Adress adress);
    Adress delete(long id);
}
