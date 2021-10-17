/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bike.controller;

import com.bike.model.Bike;
import com.bike.service.BikeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author drida
 */
@RestController //anotacion
@RequestMapping ("/api/Bike")// sirve para indica un contexto o una carpeta
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})


public class BikeController {
    
    @Autowired
    private BikeService bikeservice;
    
    @GetMapping("/all")
    public List<Bike> getAll(){
        return bikeservice.getAll();
   
    }
    
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Bike Save(@RequestBody Bike bike){
        return bikeservice.save(bike);
    }
}
