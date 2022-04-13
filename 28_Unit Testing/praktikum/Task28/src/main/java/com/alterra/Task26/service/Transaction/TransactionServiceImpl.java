package com.alterra.Task26.service.Transaction;

import com.alterra.Task26.model.TransactionModel;
import com.alterra.Task26.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService{
    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public TransactionModel getTransaction(TransactionModel payload) {
        transactionRepository.save(payload);
        return payload;
    }

    @Override
    public List<TransactionModel> getAllTransaction() {
        return (List<TransactionModel>) transactionRepository.findAll();
    }

    @Override
    public void delete(String id) {
        transactionRepository.deleteById(id);
    }
}
