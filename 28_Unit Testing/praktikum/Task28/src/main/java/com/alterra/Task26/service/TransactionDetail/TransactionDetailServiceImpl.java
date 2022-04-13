package com.alterra.Task26.service.TransactionDetail;

import com.alterra.Task26.model.TransactionDetailModel;
import com.alterra.Task26.repository.TransactionDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionDetailServiceImpl implements TransactionDetailService {
    @Autowired
    private TransactionDetailRepository transactionDetailRepository;


  @Override
    public TransactionDetailModel getTransactionDetail(TransactionDetailModel payload){
        transactionDetailRepository.save(payload);
        return payload;
    }

    @Override
    public List<TransactionDetailModel> getAllTransactionDetail() {

      return transactionDetailRepository.findAll();
    }

    @Override
    public void delete(String id) {
        transactionDetailRepository.deleteById(id);
    }
}
