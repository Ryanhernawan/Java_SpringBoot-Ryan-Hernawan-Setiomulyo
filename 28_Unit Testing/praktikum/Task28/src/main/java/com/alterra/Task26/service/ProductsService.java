package com.alterra.Task26.service;

import com.alterra.Task26.model.ProductsModel;

import java.util.List;

public interface ProductsService {
    ProductsModel createNewProduct(ProductsModel productsModel);
    List<ProductsModel> findAll();
    ProductsModel getProductById(String id);
    void delete(String id);
}
