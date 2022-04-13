package com.alterra.Task26.controller;

import com.alterra.Task26.model.ModelBaseResponse;
import com.alterra.Task26.model.ProductsModel;
import com.alterra.Task26.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsController {
    @Autowired
    private ProductsService productsService;

   @GetMapping
    public ModelBaseResponse<List<ProductsModel>> findAll(){
       ModelBaseResponse<List<ProductsModel>> modelBaseResponse = new ModelBaseResponse<>();
       modelBaseResponse.setSuccess(true);
       modelBaseResponse.setMessage("Succes");
       modelBaseResponse.setData(productsService.findAll());
       return modelBaseResponse;
   }

    @PostMapping
    public ModelBaseResponse<List<ProductsModel>> create(@RequestBody ProductsModel productsModel){
        ModelBaseResponse<List<ProductsModel>> modelBaseResponse = new ModelBaseResponse<>();
        modelBaseResponse.setSuccess(true);
        modelBaseResponse.setMessage("Succes");
        modelBaseResponse.setData(List.of(productsService.createNewProduct(productsModel)));
        return modelBaseResponse;
    }

    @PostMapping("/{id}")
    public ModelBaseResponse<ProductsModel> getProductById(@PathVariable("id") @RequestBody String id){
        ModelBaseResponse<ProductsModel> modelBaseResponse = new ModelBaseResponse<>();
        modelBaseResponse.setSuccess(true);
        modelBaseResponse.setMessage("Succes");
        modelBaseResponse.setData(productsService.getProductById(id));
        return modelBaseResponse;
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") String id){
       productsService.delete(id);
       return "Success";
    }
}
