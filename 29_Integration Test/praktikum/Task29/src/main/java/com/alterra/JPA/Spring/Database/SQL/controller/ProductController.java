package com.alterra.JPA.Spring.Database.SQL.controller;


import com.alterra.JPA.Spring.Database.SQL.model.ModelBaseResponse;
import com.alterra.JPA.Spring.Database.SQL.model.ModelProduct;
import com.alterra.JPA.Spring.Database.SQL.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/product")
public class ProductController {
    @Autowired
    private ProductService productService;


    @GetMapping
    public ModelBaseResponse<List<ModelProduct>> getAllProduct(){
        ModelBaseResponse<List<ModelProduct>> modelBaseResponse = new ModelBaseResponse<>();
        modelBaseResponse.setSuccess(true);
        modelBaseResponse.setMessage("Succes");
        modelBaseResponse.setData(productService.getAllProduct());
        return modelBaseResponse;
    }
    @PostMapping
    public ModelBaseResponse<ModelProduct> getNewProduct(@RequestBody ModelProduct payload){
        ModelBaseResponse<ModelProduct> modelBaseResponse = new ModelBaseResponse<>();
        modelBaseResponse.setSuccess(true);
        modelBaseResponse.setMessage("Succes");
        modelBaseResponse.setData(productService.createNewProduct(payload));
        return modelBaseResponse;

    }

    @DeleteMapping("/{id}")
    public String  deleteProductById (@PathVariable("id") Long id) {
        productService.deleteProductById(id);
        return "Deleted Successfully";
    }



}
