package com.alterra.JPA.Spring.Database.SQL.model;

import lombok.Data;

@Data
public class ModelBaseResponse<T> {
    private Boolean success;
    private String message;
    private T data;
}