package com.alterra.Task26.service;

import com.alterra.Task26.model.ProductsModel;
import com.alterra.Task26.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsServiceImpl implements ProductsService{
    @Autowired
    private ProductsRepository productsRepository;

    @Override
    public List<ProductsModel> findAll() {
        return productsRepository.findAll();
    }

    @Override
    public ProductsModel getProductById(String id) {
        ProductsModel productsModel = new ProductsModel();
        productsModel = productsRepository.findById(id).orElse(null);
        return productsModel;
    }

    @Override
    public ProductsModel createNewProduct(ProductsModel productsModel) {
        productsRepository.save(productsModel);
        return productsModel ;
    }
    @Override
    public void delete(String id) {

        productsRepository.deleteById(id);
    }

}
