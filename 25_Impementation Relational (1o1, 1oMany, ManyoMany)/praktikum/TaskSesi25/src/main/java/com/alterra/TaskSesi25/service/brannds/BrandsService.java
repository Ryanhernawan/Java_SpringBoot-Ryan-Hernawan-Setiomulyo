package com.alterra.TaskSesi25.service.brannds;

import com.alterra.TaskSesi25.model.BrandsModel;
import com.alterra.TaskSesi25.model.CategoriesModel;

import java.util.List;

public interface BrandsService {
    List<BrandsModel> getAllBrands();
    BrandsModel getNewBrands(BrandsModel payload);
    void deleteBrandsById(Long id);

}
