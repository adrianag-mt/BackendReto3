/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bike.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author drida
 */
@Entity
@Table(name = "bike")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bike {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, length = 45)
    private String name;
    @Column(nullable = false, length = 45)
    private String brand;
    @Column(nullable = false, length = 4)
     private String year;
     @Column(nullable = false, length = 250)
    private String description;
    
    @ManyToOne
    @JoinColumn (name = "categoryID")
    @JsonIgnoreProperties("bikes")
    private Category category; // la bicicleta tien uan relacion con categoria
    
    @OneToMany(cascade={CascadeType.PERSIST},mappedBy = "bike")
    @JsonIgnoreProperties("bike")
    private List<Message>messages;
        
    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "bike")
    @JsonIgnoreProperties({"bike","messages"})
    public List<Reservation> reservations;
 
}