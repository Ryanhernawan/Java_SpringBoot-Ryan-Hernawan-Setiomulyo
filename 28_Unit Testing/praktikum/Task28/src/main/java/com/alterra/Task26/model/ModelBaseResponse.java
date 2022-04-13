package com.alterra.Task26.model;

import lombok.Data;

@Data
public class ModelBaseResponse<T> {
    private Boolean success;
    private String message;
    private T data;

}
