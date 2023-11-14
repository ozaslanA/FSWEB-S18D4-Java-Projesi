package com.example.demo.controller;


import com.example.demo.entity.Adress;
import com.example.demo.service.AdressService;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/adress")
public class AdressController {

    private AdressService adressService;

    @Autowired
    public AdressController(AdressService adressService) {
        this.adressService = adressService;
    }


    @GetMapping("/")
    public List<Adress> findAll(){
        return adressService.findAll();
    }

    @GetMapping("/{id}")
    public Adress find(@PathVariable long id){
        return adressService.find(id);
    }

    @PostMapping("/")
    public Adress save(@RequestBody Adress adress ){
        return adressService.save(adress);

    }

    @PutMapping("/{id}")
    public Adress update(@RequestBody Adress adress,@PathVariable long id ){
        Adress foundadress=adressService.find(id);
        if(foundadress !=null){
            adress.setId(id);
            return adressService.save(adress);
        }
        return null;


    }

    @DeleteMapping("/{id}")
    public Adress remove(@PathVariable long id){
        return  adressService.delete(id);
    }
}
