package com.alterra.TaskSesi25.service.products;

import com.alterra.TaskSesi25.model.ProductsModel;
import com.alterra.TaskSesi25.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;
@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductsRepository productsRepository;

    @Override
    public List<ProductsModel> getAllProducts() {

        return (List<ProductsModel>) productsRepository.findAll();
    }

    @Override
    public ProductsModel getNewProducts(ProductsModel payload) {
        productsRepository.save(payload);
        return payload;
    }

    @Override
    public void deleteProductsById(Long id) {
        productsRepository.deleteById(id);
    }

    @Override
    public List<ProductsModel> findAllProductPaginate(Pageable pageable) {
        productsRepository.findAllProductPaginate(pageable);
        return (List<ProductsModel>) productsRepository.findAll();
    }





}
