package com.alterra.TaskSesi25.repository;

import com.alterra.TaskSesi25.model.CategoriesModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriesRepository extends CrudRepository<CategoriesModel, Long>{

}
