/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bike.repository;

import com.bike.model.Bike;
import com.bike.repository.crud.BikeCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author drida
 */
@Repository
public class BikeRepository {
    @Autowired //
    private BikeCrudRepository bikeCrudRepository;
    //retorna el listado de biciletas
    public List<Bike>getall(){
        return (List<Bike>) bikeCrudRepository.findAll(); 
    }
    
    // valida si existe un bicileta cuto codigo coincida con el valor recibido en el paramteros
    //una bicleta o vacio si no existe una asociada al valor de l paramtero recibido 
    // es como un select * from bike where id =
    public  Optional<Bike>getBike(int id){
        return bikeCrudRepository.findById(id);
    }
    
    
    public Bike save(Bike bike){
        return bikeCrudRepository.save(bike);
    }
            
    
}
