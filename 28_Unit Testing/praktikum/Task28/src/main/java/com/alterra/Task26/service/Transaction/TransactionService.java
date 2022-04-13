package com.alterra.Task26.service.Transaction;

import com.alterra.Task26.model.TransactionModel;

import java.util.List;

public interface TransactionService {
    TransactionModel getTransaction(TransactionModel payload);
    List<TransactionModel> getAllTransaction();
    void delete(String id);
}
