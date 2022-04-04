package com.alterra.Task26.service.Products;

import com.alterra.Task26.model.ProductsModel;

import java.util.List;

public interface ProductsService {
    ProductsModel create(ProductsModel productsModel);
    List<ProductsModel> findAll();
//    ProductsModel findById(String id);
//    ProductsModel update(String id, ProductsModel productsModel);
    void delete(String id);
}
