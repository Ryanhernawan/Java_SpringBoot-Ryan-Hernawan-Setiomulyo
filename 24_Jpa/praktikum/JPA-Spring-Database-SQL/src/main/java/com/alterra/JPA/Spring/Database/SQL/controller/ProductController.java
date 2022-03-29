package com.alterra.JPA.Spring.Database.SQL.controller;


import com.alterra.JPA.Spring.Database.SQL.model.ModelBaseResponse;
import com.alterra.JPA.Spring.Database.SQL.model.ModelProduct;
import com.alterra.JPA.Spring.Database.SQL.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/product")
public class ProductController {
    @Autowired
    private ProductService productService;


    @GetMapping
    public ModelBaseResponse getAllProduct(){
        ModelBaseResponse<List<ModelProduct>> modelBaseResponse = new ModelBaseResponse<>();
        modelBaseResponse.setSuccess(true);
        modelBaseResponse.setMessage("Succes");
        modelBaseResponse.setData(productService.getAllProduct());
        return modelBaseResponse;
    }
    @PostMapping
    public ModelBaseResponse getNewProduct(@RequestBody ModelProduct payload){
        ModelBaseResponse<List<ModelProduct>> modelBaseResponse = new ModelBaseResponse<>();
        modelBaseResponse.setSuccess(true);
        modelBaseResponse.setMessage("Succes");
        modelBaseResponse.setData(productService.getNewProduct(payload));

        return modelBaseResponse;

    }

    @DeleteMapping("/{id}")
    public String  deleteProductById (@PathVariable("id") Long id) {
        productService.deleteProductById(id);
        return "Deleted Successfully";
    }



}
