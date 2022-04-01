package com.alterra.TaskSesi25.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModelBaseResponse<T> {
    private Boolean success;
    private String message;
    private T data;

    public ModelBaseResponse(Boolean success, String message){
        this.success = success;
        this.message = message;
    }
}
