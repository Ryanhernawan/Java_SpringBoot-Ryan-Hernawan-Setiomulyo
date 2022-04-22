package com.alterra.Task30.service;

import com.alterra.Task30.model.ModelProduct;
import com.alterra.Task30.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
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
        log.info("Product Found : {} ", modelProduct);
        return modelProduct;
    }

    @Override
    public void deleteProductById(Long id){
        productRepository.deleteById(id);
    }




}
