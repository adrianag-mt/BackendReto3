/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bike.service;

import com.bike.model.Category;
import com.bike.model.Client;
import com.bike.repository.ClientRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author drida
 */
@Service
public class ClientService {
    @Autowired
    private ClientRepository clienteRepository;
    
       public List<Client> getAll() {
        return clienteRepository.getAll();
    }

    public Optional<Client> getCategory(int id) {
        return clienteRepository.getCategory(id);
    }

    /**
     * Inserta una categoria
     *
     * @param category una categoria
     * @return una categoria
     */
    public Client save(Client client) {
        if (client.getIdClient()== null) {
            return clienteRepository.save(client);
        } else {
            Optional<Client> client1 = clienteRepository.getCategory(client.getIdClient());
            if (client1.isEmpty()) {
                return clienteRepository.save(client);
            } else {
                return client;
            }
        }
    }
}

    

