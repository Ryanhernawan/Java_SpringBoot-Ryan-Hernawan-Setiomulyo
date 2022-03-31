package com.alterra.TaskSesi25.controller;

import com.alterra.TaskSesi25.model.ModelBaseResponse;
import com.alterra.TaskSesi25.model.ProductsModel;
import com.alterra.TaskSesi25.service.products.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/v1/products")
public class ProductsController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public ModelBaseResponse<List<ProductsModel>>  getAllProducts(){
        ModelBaseResponse<List<ProductsModel>> modelBaseResponse = new ModelBaseResponse<>();
        modelBaseResponse.setSuccess(true);
        modelBaseResponse.setMessage("Succes");
        modelBaseResponse.setData(productService.getAllProducts());
        return modelBaseResponse;
    }

    @PostMapping
    public ModelBaseResponse<List<ProductsModel>>  getNewProducts(@RequestBody ProductsModel payload){
        ModelBaseResponse<List<ProductsModel>> modelBaseResponse = new ModelBaseResponse<>();
        modelBaseResponse.setSuccess(true);
        modelBaseResponse.setMessage("Success");
        modelBaseResponse.setData(List.of(productService.getNewProducts(payload)));
        return modelBaseResponse;
    }

    @DeleteMapping("/{product_id}")
    private String deleteProductsById(@PathVariable("product_id") Long product_id){
        productService.deleteProductsById(product_id);
        return "Success";
    }

}
