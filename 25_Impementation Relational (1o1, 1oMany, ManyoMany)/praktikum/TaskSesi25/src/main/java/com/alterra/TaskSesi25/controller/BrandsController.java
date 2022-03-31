package com.alterra.TaskSesi25.controller;

import com.alterra.TaskSesi25.model.BrandsModel;
import com.alterra.TaskSesi25.model.ModelBaseResponse;
import com.alterra.TaskSesi25.service.brannds.BrandsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/v1/brands")
public class BrandsController {
    @Autowired
    private BrandsService brandsService;

    @GetMapping
    public ModelBaseResponse<List<BrandsModel>>  getAllBrands(){
        ModelBaseResponse<List<BrandsModel>> modelBaseResponse = new ModelBaseResponse<>();
        modelBaseResponse.setSuccess(true);
        modelBaseResponse.setMessage("Succes");
        modelBaseResponse.setData(brandsService.getAllBrands());
        return modelBaseResponse;
    }

    @PostMapping
    public ModelBaseResponse<List<BrandsModel>>  getNewBrands(@RequestBody BrandsModel payload){
        ModelBaseResponse<List<BrandsModel>> modelBaseResponse = new ModelBaseResponse<>();
        modelBaseResponse.setSuccess(true);
        modelBaseResponse.setMessage("Succes");
        modelBaseResponse.setData(List.of(brandsService.getNewBrands(payload)));
        return modelBaseResponse;
    }

    @DeleteMapping("/{brands_id}")
    public String deleteBrandsById(@PathVariable("brands_id") Long brands_id){
        brandsService.deleteBrandsById(brands_id);
        return "Success";
    }
}
