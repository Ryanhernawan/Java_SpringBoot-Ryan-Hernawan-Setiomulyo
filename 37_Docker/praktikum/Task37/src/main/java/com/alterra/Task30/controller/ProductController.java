package com.alterra.Task30.controller;


import com.alterra.Task30.model.ModelBaseResponse;
import com.alterra.Task30.model.ModelProduct;
import com.alterra.Task30.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j
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
        log.info("Getting all product ..." );
        return modelBaseResponse;
    }
    @GetMapping("/{id}")
    public ModelBaseResponse<ModelProduct> getProductById(@PathVariable("id") Long id){
        ModelBaseResponse<ModelProduct> modelBaseResponse = new ModelBaseResponse<>();
        modelBaseResponse.setSuccess(true);
        modelBaseResponse.setMessage("Succes");
        modelBaseResponse.setData(productService.getProductById(id));
        log.info("Getting product by id {} ..." , id);
        return modelBaseResponse;
    }
    @PostMapping
    public ModelBaseResponse<ModelProduct> createNewProduct(@RequestBody ModelProduct payload){
        ModelBaseResponse<ModelProduct> modelBaseResponse = new ModelBaseResponse<>();
        modelBaseResponse.setSuccess(true);
        modelBaseResponse.setMessage("Succes");
        modelBaseResponse.setData(productService.createNewProduct(payload));
        log.info("Create new product {} ..." , payload);
        return modelBaseResponse;

    }

    @DeleteMapping("/{id}")
    public String  deleteProductById (@PathVariable("id") Long id) {
        productService.deleteProductById(id);
        log.info("Deletting product by id {} ..." , id);
        return "Deleted Successfully";
    }



}
