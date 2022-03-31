package com.alterra.TaskSesi25.service.products;

import com.alterra.TaskSesi25.model.BrandsModel;
import com.alterra.TaskSesi25.model.ProductsModel;

import java.util.List;

public interface ProductService {
    List<ProductsModel> getAllProducts();
    ProductsModel getNewProducts(ProductsModel payload);
    void deleteProductsById(Long id);
}
