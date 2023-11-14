package com.example.demo.service;

import com.example.demo.entity.Adress;
import com.example.demo.repository.AdressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class AdressServiceImpl implements AdressService{

    private AdressRepository adressRepository;

    @Autowired
    public AdressServiceImpl(AdressRepository adressRepository) {
        this.adressRepository = adressRepository;
    }



    @Override
    public List<Adress> findAll() {
        return adressRepository.findAll();
    }

    @Override
    public Adress find(long id) {
        Optional<Adress>optionalAdress=adressRepository.findById(id);
        if(optionalAdress.isPresent()){
        return optionalAdress.get();
    }
        return null;
    }


    @Override
    public Adress save(Adress adress) {
        return adressRepository.save(adress);
    }

    @Override
    public Adress delete(long id) {
        Adress adress=find(id);
        if(adress!=null){
            return adress;
        }
        return null;
    }
}
