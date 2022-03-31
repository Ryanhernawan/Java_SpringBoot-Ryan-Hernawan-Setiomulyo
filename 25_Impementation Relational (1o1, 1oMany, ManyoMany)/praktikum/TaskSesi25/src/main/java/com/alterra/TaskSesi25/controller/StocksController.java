package com.alterra.TaskSesi25.controller;

import com.alterra.TaskSesi25.model.ModelBaseResponse;
import com.alterra.TaskSesi25.model.ProductsModel;
import com.alterra.TaskSesi25.model.StocksModel;
import com.alterra.TaskSesi25.repository.StocksRepository;
import com.alterra.TaskSesi25.service.stocks.StocksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/v1/stocks")
public class StocksController {
    @Autowired
    private StocksService stocksService;

    @GetMapping
    public ModelBaseResponse<List<StocksModel>>  getAllStocks(){
        ModelBaseResponse<List<StocksModel>> modelBaseResponse = new ModelBaseResponse<>();
        modelBaseResponse.setSuccess(true);
        modelBaseResponse.setMessage("Success");
        modelBaseResponse.setData(stocksService.getAllStocks());
        return modelBaseResponse;
    }

    @PostMapping
    public ModelBaseResponse<List<StocksModel>>  getNewStocks(@RequestBody StocksModel payload){
        ModelBaseResponse<List<StocksModel>> modelBaseResponse = new ModelBaseResponse<>();
        modelBaseResponse.setSuccess(true);
        modelBaseResponse.setMessage("Success");
        modelBaseResponse.setData(List.of(stocksService.getNewStocks(payload)));
        return modelBaseResponse;
    }

    @DeleteMapping
    public String deleteStocksById(@PathVariable("store_id") Long store_id){
        stocksService.deleteStocksById(store_id);
        return "Success";
    }
}
