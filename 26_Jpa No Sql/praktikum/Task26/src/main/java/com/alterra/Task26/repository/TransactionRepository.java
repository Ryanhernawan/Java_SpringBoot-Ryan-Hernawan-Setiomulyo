package com.alterra.Task26.repository;

import com.alterra.Task26.model.TransactionModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends MongoRepository<TransactionModel, String> {
}
