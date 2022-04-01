package com.alterra.TaskSesi25.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "brands")
public class BrandsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "brand_name")
    private String brand_name;
}
