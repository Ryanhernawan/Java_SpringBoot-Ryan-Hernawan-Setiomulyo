package com.alterra.JPA.Spring.Database.SQL.repository;

import com.alterra.JPA.Spring.Database.SQL.model.ModelProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends JpaRepository<ModelProduct, Long> {

}
