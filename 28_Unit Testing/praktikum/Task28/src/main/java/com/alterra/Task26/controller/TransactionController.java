package com.alterra.Task26.controller;


import com.alterra.Task26.model.ModelBaseResponse;
import com.alterra.Task26.model.TransactionModel;
import com.alterra.Task26.service.Transaction.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @GetMapping
    public ModelBaseResponse<List<TransactionModel>> getAllTransaction(){
        ModelBaseResponse<List<TransactionModel>> modelBaseResponse = new ModelBaseResponse<>();
        modelBaseResponse.setSuccess(true);
        modelBaseResponse.setMessage("Success");
        modelBaseResponse.setData(transactionService.getAllTransaction());
        return modelBaseResponse;
    }

    @PostMapping
    public ModelBaseResponse<List<TransactionModel>> getTransaction(@RequestBody TransactionModel payload){
        ModelBaseResponse<List<TransactionModel>> modelBaseResponse = new ModelBaseResponse<>();
        modelBaseResponse.setSuccess(true);
        modelBaseResponse.setMessage("Success");
        modelBaseResponse.setData(List.of(transactionService.getTransaction(payload)));
        return modelBaseResponse;
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") String id){
        transactionService.delete(id);
        return "Success";
    }


}
