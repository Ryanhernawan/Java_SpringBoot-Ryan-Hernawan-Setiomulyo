package com.alterra.TaskSesi25.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "stocks")
public class StocksModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long store_id;

    @Column(name = "product_id")
    private Long product_id;

    @Column(name = "quantity")
    private Long quantity;

}
