package com.alterra.TaskSesi25.service.categories;

import com.alterra.TaskSesi25.model.BrandsModel;
import com.alterra.TaskSesi25.model.CategoriesModel;

import java.util.List;

public interface CategoriesService {
    List<CategoriesModel> getAllCategories();
    CategoriesModel getNewCategories(CategoriesModel payload);
    void deleteCategoriesById(Long id);
}
