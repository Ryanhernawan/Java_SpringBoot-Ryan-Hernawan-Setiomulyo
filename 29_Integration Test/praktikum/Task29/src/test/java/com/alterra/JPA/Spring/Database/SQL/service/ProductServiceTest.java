package com.alterra.JPA.Spring.Database.SQL.service;

import com.alterra.JPA.Spring.Database.SQL.model.ModelProduct;
import com.alterra.JPA.Spring.Database.SQL.repository.ProductRepository;
import org.jeasy.random.EasyRandom;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

public class ProductServiceTest {


    private final EasyRandom easyRandom = new EasyRandom();
    private Long id;

    @InjectMocks
    ProductServiceImpl productService;

    @Mock
    ProductRepository productRepository;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        id = easyRandom.nextLong();
    }

    @Test
    public void getProductById_WillReturnModelProduct() {
        // Proses Given
        ModelProduct modelProduct = easyRandom.nextObject(ModelProduct.class);
        when(productRepository.findById(id)).thenReturn(Optional.ofNullable(modelProduct));
        // Proses When
        ModelProduct result = productService.getProductById(id);
        // Proses Then
        assertEquals(modelProduct, result);
    }

    @Test
    public void getAllProduct_WillThrowException(){
        String  errorMessage= "Tidak ada product";
        when(productRepository.findAll()).thenAnswer(x ->{
           throw new Exception(errorMessage);
        });
        Exception exception = assertThrows(Exception.class, () -> {
            productService.getAllProduct();
        });
        assertTrue(exception.getMessage().equals(errorMessage));
    }

    @Test
    public void createNewProduct_WillReturnModelProduct(){
        ModelProduct modelProduct = easyRandom.nextObject(ModelProduct.class);
        when(productRepository.save(modelProduct)).thenReturn(modelProduct);
        ModelProduct result = productService.createNewProduct(modelProduct);
        assertEquals(modelProduct, result);
    }



}
