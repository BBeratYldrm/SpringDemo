package com.berat.proje.boot.controller;

import com.berat.proje.boot.entities.Category;
import com.berat.proje.boot.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/category")
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @PostMapping(path = "/add")
    public Category addNewCategory(@RequestBody Category category) {
        return categoryRepository.save(category);
    }

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<Category> getAllUsers() {
        return categoryRepository.findAll();
    }
}
