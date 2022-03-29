package com.alterra.TaskSpingbootMVC_2.sevice;

import com.alterra.TaskSpingbootMVC_2.model.ModelCategory;
import com.alterra.TaskSpingbootMVC_2.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceCategoryImpl implements ServiceCategory {
    @Autowired
    private CategoryRepository ModelCategory;

    @Override
    public List<ModelCategory> getAllProduct() {
        return (List<ModelCategory>) ModelCategory.findAll();
    }
    // POST
    @Override
    public List<ModelCategory> getNewProduct(ModelCategory payload){
        return (List<ModelCategory>) ModelCategory.save(payload);
    }
    @Override
    public void deleteProductById(Long id){
        ModelCategory.deleteById(id);
    }
}
