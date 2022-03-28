package com.alterra.ConfigureSwagger.model;

import io.swagger.models.auth.In;
import lombok.Data;

import javax.persistence.*;


@Data
public class ModelProduct {

    private String product;
    private Integer id;
    private String name;
    private String description;
    private Integer stock;
    private Integer price;


}
