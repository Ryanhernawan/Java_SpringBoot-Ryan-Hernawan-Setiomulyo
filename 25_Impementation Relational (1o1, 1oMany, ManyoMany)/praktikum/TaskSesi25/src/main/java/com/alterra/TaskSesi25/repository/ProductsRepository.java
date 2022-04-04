package com.alterra.TaskSesi25.repository;

import com.alterra.TaskSesi25.model.ProductsModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.websocket.server.PathParam;
import java.awt.print.Pageable;
import java.util.List;

@Repository

public interface ProductsRepository extends CrudRepository<ProductsModel, Long> {

    List<ProductsModel> findAllProductPaginate(Pageable pageable);

}
