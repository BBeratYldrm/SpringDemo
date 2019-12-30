package com.berat.proje.boot.controller;

import com.berat.proje.boot.entities.Product;
import com.berat.proje.boot.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping(path = "/add")
    public Product addNewProduct(@RequestBody Product product) {
        productRepository.save(product);
        return product;
    }

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<Product> getAllProducts() {
        return productRepository.findAll();

    }
}
