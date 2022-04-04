package com.alterra.Task26.repository;

import com.alterra.Task26.model.TransactionDetailModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TransactionDetailRepository extends MongoRepository<TransactionDetailModel, String> {
}
