package com.alterra.TaskSpingbootMVC_2.repository;

import com.alterra.TaskSpingbootMVC_2.model.ModelCategory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<ModelCategory, Long> {

}
