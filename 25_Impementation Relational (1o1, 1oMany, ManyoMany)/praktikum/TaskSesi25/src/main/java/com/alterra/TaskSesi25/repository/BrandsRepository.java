package com.alterra.TaskSesi25.repository;

import com.alterra.TaskSesi25.model.BrandsModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BrandsRepository extends CrudRepository<BrandsModel, Long> {

}
