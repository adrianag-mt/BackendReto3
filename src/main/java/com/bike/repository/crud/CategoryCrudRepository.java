package com.bike.repository.crud;

import com.bike.model.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * Interfaz que extiende de CrudRepositorypara la clase Category
 * @author desaextremo
 */
public interface CategoryCrudRepository extends CrudRepository<Category, Integer>{
    
}

