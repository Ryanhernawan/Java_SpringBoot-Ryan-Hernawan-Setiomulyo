package com.alterra.ConfigureSwagger.model;

import lombok.Data;
// anotation getter setter from lombok depedency
@Data
public class ModelBaseResponse<T> {
    private Boolean success;
    private String message;
    private T data;
}
