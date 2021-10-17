package com.bike.service;

import com.bike.model.Category;
import com.bike.repository.CategoryRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Esta clase se utiliza para escribir métodos de negocio y validaciones sobre
 * la información de la Entidad Category
 *
 * @author desaextremo
 */
@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    /**
     * REcupera los datsos de las categorias
     *
     * @return listado de categorias
     */
    public List<Category> getAll() {
        return categoryRepository.getAll();
    }

    public Optional<Category> getCategory(int id) {
        return categoryRepository.getCategory(id);
    }

    /**
     * Inserta una categoria
     *
     * @param category una categoria
     * @return una categoria
     */
    public Category save(Category category) {
        if (category.getId() == null) {
            return categoryRepository.save(category);
        } else {
            Optional<Category> category1 = categoryRepository.getCategory(category.getId());
            if (category1.isEmpty()) {
                return categoryRepository.save(category);
            } else {
                return category;
            }
        }
    }
}
