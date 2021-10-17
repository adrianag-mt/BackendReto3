package com.bike.repository;

import com.bike.model.Category;
import com.bike.repository.crud.CategoryCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Esta clase accede a la interfaz que extiende de CrudRepository y le solicita
 * servicios o métodos que soportan operacioes de crud
 * @author desaextremo
 */
@Repository
public class CategoryRepository {
    @Autowired
    private CategoryCrudRepository categoryCrudRepository;
    
    
    /**
     * Retorna información de la tabla categorias
     * @return Listado de todas las categorias
     */
    public List<Category> getAll(){
        return (List<Category>) categoryCrudRepository.findAll();
    }
    
    /**
     * Retorna una categoria que corresponda con el codigo recibido como parametro
     * @param id valor de un codigo de categoria
     * @return Una categoria
     */
    public Optional<Category> getCategory(int id){
        return categoryCrudRepository.findById(id);
    }
    
    /**
     * Inserta un registro
     * @param category Una categoria
     * @return Una categoria
     */
    public Category save(Category category){
        return categoryCrudRepository.save(category);
    }
    
}
