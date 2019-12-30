package com.berat.proje.boot.repository;

import com.berat.proje.boot.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
    
}
