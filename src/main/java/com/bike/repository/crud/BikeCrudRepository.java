/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bike.repository.crud;

import com.bike.model.Bike;
import org.springframework.data.repository.CrudRepository;

/** extiende de la clase crudrepository
 * recibe la clase in 
 * @author drida
 */
public interface BikeCrudRepository extends CrudRepository<Bike, Integer>{
    
}
