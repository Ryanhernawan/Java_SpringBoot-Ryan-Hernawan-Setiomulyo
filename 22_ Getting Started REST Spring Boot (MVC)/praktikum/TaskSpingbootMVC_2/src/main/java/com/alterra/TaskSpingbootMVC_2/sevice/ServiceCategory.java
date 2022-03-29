package com.alterra.TaskSpingbootMVC_2.sevice;

import com.alterra.TaskSpingbootMVC_2.model.ModelCategory;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ServiceCategory{

    List<ModelCategory> getAllProduct();

    // POST
    List<ModelCategory> getNewProduct(ModelCategory payload);

    void deleteProductById(Long id);
}
