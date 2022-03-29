package com.alterra.JPA.Spring.Database.SQL.service;

import com.alterra.JPA.Spring.Database.SQL.model.ModelProduct;

import java.util.List;
import java.util.Optional;

public interface ProductService {


    List<ModelProduct> getAllProduct();
    List<ModelProduct> getNewProduct(ModelProduct payload);
    void deleteProductById(Long id);

}
