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

    @ManyToOne
    @JoinColumn(name = "brand_id", referencedColumnName = "id")
    BrandsModel brand;

    //Relations
    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    CategoriesModel category;

    @Column(name = "model_year")
    private String model_year;

    @Column(name = "list_price")
    private Long list_price;
}
