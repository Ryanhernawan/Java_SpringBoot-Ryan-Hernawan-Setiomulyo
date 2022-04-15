package com.alterra.Task30.service;

import com.alterra.Task30.model.ModelProduct;

import java.util.List;

public interface ProductService {
    List<ModelProduct> getAllProduct();
    ModelProduct createNewProduct(ModelProduct payload);
    ModelProduct getProductById(Long id);
    void deleteProductById(Long id);

}
