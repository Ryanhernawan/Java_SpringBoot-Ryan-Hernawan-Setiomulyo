package com.alterra.TaskSpingbootMVC_2.model;

import lombok.Data;

@Data
public class ModelBaseResponse<T> {
    private Boolean succes;
    private String message;
    private T data;
}
