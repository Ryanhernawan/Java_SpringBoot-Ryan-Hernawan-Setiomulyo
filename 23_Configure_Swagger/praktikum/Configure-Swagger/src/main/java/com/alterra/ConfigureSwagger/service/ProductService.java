package com.alterra.ConfigureSwagger.service;

import com.alterra.ConfigureSwagger.model.ModelBaseResponse;
import com.alterra.ConfigureSwagger.model.ModelProduct;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    public List<ModelProduct>  getAllProduct(){
        List<ModelProduct> data = new ArrayList<>();
        ModelProduct MProduct = new ModelProduct();
        MProduct.setProduct("Book");
        MProduct.setId(1);
        MProduct.setName("Laskar Pelangi");
        MProduct.setDescription("Buku dengan judul laskar pelangi");
        MProduct.setStock(20);
        MProduct.setPrice(25000);
        data.add(MProduct);

        ModelProduct MProduct2 = new ModelProduct();
        MProduct2.setProduct("Magazine");
        MProduct2.setId(2);
        MProduct2.setName("ABC Magazine");
        MProduct2.setDescription("Majalah dengan judul ABC");
        MProduct2.setStock(10);
        MProduct2.setPrice(5000);
        data.add(MProduct2);

        return data;

    }
    public static String AddProduct(ModelProduct modelProduct) {
        List<ModelProduct> newData = new ArrayList<>();
        newData.add(modelProduct);
        return "Succes Add New Data";
    }

//    public String postProduct(ModelProduct modelProduct) {
//        List<ModelProduct> newData = new ArrayList<>();
//        newData.add(modelProduct);
//        return "Succes Add New Data";
//    }
}
