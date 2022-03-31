package com.alterra.TaskSesi25.service.stocks;

import com.alterra.TaskSesi25.model.StocksModel;
import com.alterra.TaskSesi25.repository.StocksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StocksServiceImpl implements StocksService{
    @Autowired
    private StocksRepository stocksRepository;


    @Override
    public List<StocksModel> getAllStocks() {
        return (List<StocksModel>) stocksRepository.findAll();
    }

    @Override
    public StocksModel getNewStocks(StocksModel payload) {
        return stocksRepository.save(payload);
    }

    @Override
    public void deleteStocksById(Long id) {
        stocksRepository.deleteById(id);
    }
}
