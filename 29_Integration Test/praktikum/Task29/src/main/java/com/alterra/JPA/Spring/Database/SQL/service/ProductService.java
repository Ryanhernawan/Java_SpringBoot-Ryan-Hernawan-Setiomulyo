package com.alterra.JPA.Spring.Database.SQL.service;

import com.alterra.JPA.Spring.Database.SQL.model.ModelProduct;

import java.util.List;

public interface ProductService {
    List<ModelProduct> getAllProduct();
    ModelProduct createNewProduct(ModelProduct payload);
    ModelProduct getProductById(Long id);
    void deleteProductById(Long id);

}
