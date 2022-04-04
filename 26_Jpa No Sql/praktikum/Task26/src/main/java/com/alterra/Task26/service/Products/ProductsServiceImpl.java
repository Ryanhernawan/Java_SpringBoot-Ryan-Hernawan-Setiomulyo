package com.alterra.Task26.service.Products;

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
    public ProductsModel create(ProductsModel productsModel) {
        productsRepository.save(productsModel);
        return productsModel ;
    }
    @Override
    public void delete(String id) {

        productsRepository.deleteById(id);
    }
//
//    @Override
//    public ProductsModel findById(String id) {
//        return productsRepository.findById(id).orElseThrow(() ->{
//            throw new Error("product with id" + id + "is not found");
//        });
//    }
//
//    @Override
//    public ProductsModel update(String id, ProductsModel productsModel) {
//        ProductsModel productById = this.findById(id);
//        productById.setName(productsModel.getName());
//        productById.setPrice(productsModel.getPrice());
//        return productsRepository.save(productById);
//
//    }


}
