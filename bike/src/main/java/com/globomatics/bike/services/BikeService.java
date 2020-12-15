package com.globomatics.bike.services;

import com.globomatics.bike.models.Bike;
import com.globomatics.bike.repositories.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BikeService {
    @Autowired
    private BikeRepository bikeRepository;


    public  Bike findById(Long id){
        return bikeRepository.getOne(id);
    }

    public  List<Bike> findAll(){
        return bikeRepository.findAll();
    }

    public  void create(Bike bike){
         bikeRepository.save(bike);
    }
}
