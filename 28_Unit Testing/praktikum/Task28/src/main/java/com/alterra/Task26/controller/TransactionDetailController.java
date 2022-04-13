package com.alterra.Task26.controller;

import com.alterra.Task26.model.ModelBaseResponse;
import com.alterra.Task26.model.TransactionDetailModel;
import com.alterra.Task26.model.TransactionModel;
import com.alterra.Task26.service.TransactionDetail.TransactionDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transaction-detail")
public class TransactionDetailController {
    @Autowired
    private TransactionDetailService transactionDetailService;

    @GetMapping
    public ModelBaseResponse<List<TransactionDetailModel>> getAllTransactionDetail(){
        ModelBaseResponse<List<TransactionDetailModel>> modelBaseResponse = new ModelBaseResponse<>();
        modelBaseResponse.setSuccess(true);
        modelBaseResponse.setMessage("Success");
        modelBaseResponse.setData(transactionDetailService.getAllTransactionDetail());
        return modelBaseResponse;
    }
    @PostMapping
    public ModelBaseResponse<List<TransactionDetailModel>> getTransactionDetail(@RequestBody TransactionDetailModel payload){
        ModelBaseResponse<List<TransactionDetailModel>> modelBaseResponse = new ModelBaseResponse<>();
        modelBaseResponse.setSuccess(true);
        modelBaseResponse.setMessage("Success");
        modelBaseResponse.setData(List.of(transactionDetailService.getTransactionDetail(payload)));
        return modelBaseResponse;
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") String id){
        transactionDetailService.delete(id);
        return "Success";
    }

}
