package com.ciclo3.repository.crud;

import com.ciclo3.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepositoryCrud extends CrudRepository<Category, Integer>{
    
}
