package com.alterra.TaskSesi25.service.categories;

import com.alterra.TaskSesi25.model.BrandsModel;
import com.alterra.TaskSesi25.model.CategoriesModel;
import com.alterra.TaskSesi25.repository.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoriesServiceImpl implements CategoriesService{
    @Autowired
    private CategoriesRepository categoriesRepository;


    @Override
    public List<CategoriesModel> getAllCategories() {
        return (List<CategoriesModel>) categoriesRepository.findAll();
    }

    @Override
    public CategoriesModel getNewCategories(CategoriesModel payload) {
        return categoriesRepository.save(payload);
    }

    @Override
    public void deleteCategoriesById(Long id) {
        categoriesRepository.deleteById(id);
    }
}
