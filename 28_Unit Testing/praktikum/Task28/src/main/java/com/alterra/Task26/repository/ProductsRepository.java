package com.alterra.Task26.repository;

import com.alterra.Task26.model.ProductsModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductsRepository extends MongoRepository<ProductsModel, String> {
}
