/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bike.service;

import com.bike.model.Bike;
import com.bike.repository.BikeRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/** es una clase de servicio , que valida logica
 *el repositorio me provee unos metodos crud
 * @author drida
 */
@Service
public class BikeService {
    @Autowired// para que sprint se encargue de intanciar la clase automaticamente 
    private BikeRepository bikeRepository;
    
    public List<Bike>getAll(){
      return bikeRepository.getall();//metodo getall devuelve un listado e bicicletas
    }
    public Bike save(Bike bike){
        if(bike.getId()==null){
            return bikeRepository.save(bike);
        }else{
             Optional<Bike> myBike =bikeRepository.getBike(bike.getId()); 
             if (myBike.isEmpty()){
                 return bikeRepository.save(bike);
             }else{
                 return bike;
             }                     
        }
        
      //  bikeRepository.save(bike);
    }
      
}
