package com.alterra.TaskSesi25.service.stocks;

import com.alterra.TaskSesi25.model.ProductsModel;
import com.alterra.TaskSesi25.model.StocksModel;

import java.util.List;

public interface StocksService {
    List<StocksModel> getAllStocks();
    StocksModel getNewStocks(StocksModel payload);
    void deleteStocksById(Long id);

}
