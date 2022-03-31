package com.alterra.TaskSesi25.service.brannds;

import com.alterra.TaskSesi25.model.BrandsModel;
import com.alterra.TaskSesi25.repository.BrandsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BrandsServiceImpl implements BrandsService{
    @Autowired
    private BrandsRepository brandsRepository;


    @Override
    public List<BrandsModel> getAllBrands() {

        return (List<BrandsModel>) brandsRepository.findAll();
    }

    @Override
    public BrandsModel getNewBrands(BrandsModel payload) {

        return brandsRepository.save(payload);
    }

    @Override
    public void deleteBrandsById(Long id) {
        brandsRepository.deleteById(id);
    }
}
