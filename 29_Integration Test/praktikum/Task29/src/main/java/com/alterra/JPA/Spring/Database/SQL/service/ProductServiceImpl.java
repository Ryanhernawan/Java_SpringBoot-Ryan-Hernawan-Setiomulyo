package com.alterra.JPA.Spring.Database.SQL.service;

import com.alterra.JPA.Spring.Database.SQL.model.ModelProduct;
import com.alterra.JPA.Spring.Database.SQL.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;
    // GET
    @Override
    public List<ModelProduct> getAllProduct() {

        return (List<ModelProduct>) productRepository.findAll();
    }

    @Override
    public ModelProduct createNewProduct(ModelProduct payload){
        return  productRepository.save(payload);
    }

    @Override
    public ModelProduct getProductById(Long id) {
        ModelProduct modelProduct = new ModelProduct();
        modelProduct = productRepository.findById(id).orElse(null);
        return modelProduct;
    }

    @Override
    public void deleteProductById(Long id){
        productRepository.deleteById(id);
    }




}
