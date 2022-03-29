package com.alterra.TaskSpingbootMVC_2.controller;

import com.alterra.TaskSpingbootMVC_2.model.ModelCategory;
import com.alterra.TaskSpingbootMVC_2.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1")
public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;
    @GetMapping("/posts")
    public List<ModelCategory> getAllCategory(){

        return categoryRepository.findAll();
    }
    @PostMapping("/posts")
    public ModelCategory newCategory(@RequestBody ModelCategory payload){

        return categoryRepository.save(payload);
    }

    @DeleteMapping("/posts/{id}")
    public void deleteCategory (@PathVariable Long id){
        Optional<ModelCategory> categoryById = categoryRepository.findById(id);
        categoryById.ifPresent(res ->{
            categoryRepository.delete(res);
        });
    }
}
