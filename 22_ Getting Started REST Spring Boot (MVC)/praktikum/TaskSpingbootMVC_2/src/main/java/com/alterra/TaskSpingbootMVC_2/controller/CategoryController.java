package com.alterra.TaskSpingbootMVC_2.controller;

import com.alterra.TaskSpingbootMVC_2.model.ModelBaseResponse;
import com.alterra.TaskSpingbootMVC_2.model.ModelCategory;
import com.alterra.TaskSpingbootMVC_2.sevice.ServiceCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1")
public class CategoryController {
    @Autowired
    private ServiceCategory serviceCategory;

    @GetMapping("/posts")
    public ModelBaseResponse getAllProduct(){
        ModelBaseResponse<List<ModelCategory>> modelBaseResponse = new ModelBaseResponse<>();
        modelBaseResponse.setSucces(true);
        modelBaseResponse.setMessage("Succes");
        modelBaseResponse.setData(serviceCategory.getAllProduct());
       return modelBaseResponse;
    }
    @PostMapping("/posts")
    public ModelBaseResponse<List<ModelCategory>> getNewProduct(@RequestBody ModelCategory payload){
        ModelBaseResponse<List<ModelCategory>> modelBaseResponse = new ModelBaseResponse<>();
        modelBaseResponse.setSucces(true);
        modelBaseResponse.setMessage("Succes");
        modelBaseResponse.setData(serviceCategory.getNewProduct(payload));
        return modelBaseResponse;
    }

    @DeleteMapping("/posts/{id}")
    public String deleteProductById (@PathVariable("id") Long id){
        serviceCategory.deleteProductById(id);
        return "Deleted";
    }
}
