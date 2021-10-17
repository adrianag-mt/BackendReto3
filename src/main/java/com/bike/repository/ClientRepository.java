/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bike.repository;

import com.bike.model.Category;
import com.bike.model.Client;
import com.bike.repository.crud.CategoryCrudRepository;
import com.bike.repository.crud.ClientCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author drida
 */
@Repository
public class ClientRepository {
    
      @Autowired
    private ClientCrudRepository clientCrudRepository;
    public List<Client> getAll(){
        return (List<Client>) clientCrudRepository.findAll();
    }
    
    /**
     * Retorna una categoria que corresponda con el codigo recibido como parametro
     * @param id valor de un codigo de categoria
     * @return Una categoria
     */
    public Optional<Client> getCategory(int id){
        return clientCrudRepository.findById(id);
    }
    
    /**
     * Inserta un registro
     * @param category Una categoria
     * @return Una categoria
     */
    public Client save(Client client){
        return clientCrudRepository.save(client);
    }
    
}

    
   
    
