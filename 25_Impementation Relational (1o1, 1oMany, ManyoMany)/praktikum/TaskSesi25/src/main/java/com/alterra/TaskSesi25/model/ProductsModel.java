package com.alterra.TaskSesi25.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "products")
public class ProductsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long product_id;

    @Column(name = "product_name")
    private String product_name;

    @Column(name = "brand_id")
    private Long brand_id;

    @Column(name = "category_id")
    private Long category_id;

    @Column(name = "model_year")
    private String model_year;

    @Column(name = "list_price")
    private Long list_price;
}
