package com.alterra.TaskSesi25.controller;

import com.alterra.TaskSesi25.model.BrandsModel;
import com.alterra.TaskSesi25.model.CategoriesModel;
import com.alterra.TaskSesi25.model.ModelBaseResponse;
import com.alterra.TaskSesi25.repository.CategoriesRepository;
import com.alterra.TaskSesi25.service.categories.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/v1/categories")
public class CategoriesController {
    @Autowired
    private CategoriesService categoriesService;

    @GetMapping
    public ModelBaseResponse<List<CategoriesModel>> getAllCategories(){
        ModelBaseResponse<List<CategoriesModel>> modelBaseResponse = new ModelBaseResponse<>();
        modelBaseResponse.setSuccess(true);
        modelBaseResponse.setMessage("Success");
        modelBaseResponse.setData(categoriesService.getAllCategories());
        return modelBaseResponse;
    }

    @PostMapping
    public ModelBaseResponse<List<CategoriesModel>> getNewCategories(@RequestBody CategoriesModel payload){
        ModelBaseResponse<List<CategoriesModel>> modelBaseResponse = new ModelBaseResponse<>();
        modelBaseResponse.setSuccess(true);
        modelBaseResponse.setMessage("Succes");
        modelBaseResponse.setData(List.of(categoriesService.getNewCategories(payload)));
        return modelBaseResponse;
    }

    @DeleteMapping("/{category_id}")
    public String deleteCategoriesById(@PathVariable("category_id") Long category_id){
        categoriesService.deleteCategoriesById(category_id);
        return "Success";
    }

}
