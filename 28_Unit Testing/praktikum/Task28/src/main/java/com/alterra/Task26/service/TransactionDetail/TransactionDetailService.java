package com.alterra.Task26.service.TransactionDetail;

import com.alterra.Task26.model.TransactionDetailModel;

import java.util.List;

public interface TransactionDetailService {

    TransactionDetailModel getTransactionDetail(TransactionDetailModel payload);

    List<TransactionDetailModel> getAllTransactionDetail();

    void delete(String id);
}
