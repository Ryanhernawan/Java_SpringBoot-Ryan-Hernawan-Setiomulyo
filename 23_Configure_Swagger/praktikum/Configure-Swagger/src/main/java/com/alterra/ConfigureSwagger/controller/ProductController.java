package com.alterra.ConfigureSwagger.controller;

import com.alterra.ConfigureSwagger.model.ModelBaseResponse;
import com.alterra.ConfigureSwagger.model.ModelProduct;

import com.alterra.ConfigureSwagger.service.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {
//    @Autowired
//    private RepositoryProduct repositoryProduct;

    @GetMapping
    public ModelBaseResponse getProduct(){
        ProductService service = new ProductService();
        ModelBaseResponse baseResponse = new ModelBaseResponse();
        baseResponse.setSuccess(true);
        baseResponse.setMessage("Succes");
        baseResponse.setData(service.getAllProduct());
        return baseResponse;
   }
//    @PostMapping
//    public ModelProduct postProduct(@RequestBody  ModelProduct modelProduct){
//       return ProductService.AddProduct(modelProduct);
//    }

}
