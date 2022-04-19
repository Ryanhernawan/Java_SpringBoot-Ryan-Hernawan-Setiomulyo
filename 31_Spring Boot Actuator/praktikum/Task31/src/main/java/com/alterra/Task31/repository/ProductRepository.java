package com.alterra.Task31.repository;

import com.alterra.Task31.model.ModelProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ModelProduct, Long> {

}
