package com.alterra.Task26.service;

import com.alterra.Task26.model.ProductsModel;
import com.alterra.Task26.repository.ProductsRepository;
import org.jeasy.random.EasyRandom;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ProductsServiceImplTest {
    private final EasyRandom easyRandom = new EasyRandom();
    private String id;

    @InjectMocks
    ProductsServiceImpl productsService;

    @Mock
    ProductsRepository productsRepository;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getProductById_WillReturnModelProduct(){
        ProductsModel productsModel = easyRandom.nextObject(ProductsModel.class);
        when(productsRepository.findById(id)).thenReturn(Optional.ofNullable(productsModel));
        ProductsModel result = productsService.getProductById(id);
        assertEquals(productsModel, result);
    }

    @Test
    public void findAll_WillThrowException(){
        String  errorMessage= "Product Not Found";
        when(productsRepository.findAll()).thenAnswer(x ->{
            throw new Exception(errorMessage);
        });
        Exception exception = assertThrows(Exception.class, () -> {
            productsService.findAll();
        });
        assertTrue(exception.getMessage().equals(errorMessage));
    }

    @Test
    public void createNewProduct_WillReturnModelProduct(){
        ProductsModel productsModel = easyRandom.nextObject(ProductsModel.class);
        when(productsRepository.save(productsModel)).thenReturn(productsModel);
        ProductsModel result = productsService.createNewProduct(productsModel);
        assertEquals(productsModel, result);
    }

    @Test
    public void delete(){
        productsService.delete(id);
        verify(productsRepository, times(1)).deleteById(id);
    }
}