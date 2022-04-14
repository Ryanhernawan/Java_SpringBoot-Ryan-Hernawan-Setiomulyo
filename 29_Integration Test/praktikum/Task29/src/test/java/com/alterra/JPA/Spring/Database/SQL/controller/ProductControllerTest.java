package com.alterra.JPA.Spring.Database.SQL.controller;


import com.alterra.JPA.Spring.Database.SQL.ApplicationTests;
import com.alterra.JPA.Spring.Database.SQL.model.ModelProduct;
import com.alterra.JPA.Spring.Database.SQL.repository.ProductRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.hamcrest.CoreMatchers.is;


import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.MOCK,
        classes = ApplicationTests.class)
@AutoConfigureMockMvc
@TestPropertySource(
        locations = "classpath:application-integrationtest.properties")

public class ProductControllerTest {
    @Autowired
    private MockMvc mvc;

    @Autowired
    private ProductRepository productsRepository;

    @Test
    public void getAllProduct_willSuccess() throws Exception {
        createTestProduct("mouse");
        mvc.perform(get("/v1/product")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content()
                        .contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.data.[1].name", is("mouse")));
    }
    public void createTestProduct(String name){
        ModelProduct productsModel = new ModelProduct();
        productsModel.setName(name);

        this.productsRepository.saveAndFlush(productsModel);
    }
    @After
    public void resetDb(){
        this.productsRepository.deleteAll();
    }


}