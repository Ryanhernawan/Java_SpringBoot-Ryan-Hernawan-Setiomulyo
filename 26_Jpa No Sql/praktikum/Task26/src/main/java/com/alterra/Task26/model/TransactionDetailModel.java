package com.alterra.Task26.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "transaction_detail")
public class TransactionDetailModel {
    @Id
    private String id;

    private String transaction_id;
    private String product_id;
    private Long quantity;
}
