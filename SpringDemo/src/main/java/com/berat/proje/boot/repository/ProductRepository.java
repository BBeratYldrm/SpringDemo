package com.berat.proje.boot.repository;

import com.berat.proje.boot.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
    
}
