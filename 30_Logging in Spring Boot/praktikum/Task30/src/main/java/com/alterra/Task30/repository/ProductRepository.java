package com.alterra.Task30.repository;

import com.alterra.Task30.model.ModelProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ModelProduct, Long> {

}
