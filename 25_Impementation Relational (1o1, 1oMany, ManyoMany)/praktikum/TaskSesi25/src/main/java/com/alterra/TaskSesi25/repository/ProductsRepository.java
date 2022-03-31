package com.alterra.TaskSesi25.repository;

import com.alterra.TaskSesi25.model.ProductsModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.websocket.server.PathParam;
import java.util.List;

@Repository
public interface ProductsRepository extends CrudRepository<ProductsModel, Long> {
    @Query("SELECT p FROM ProductsModel p WHERE p.category_id LIKE :category_id ")
    List<ProductsModel> findProductWithCategory(@PathParam("category_id") Long category_id);


}
