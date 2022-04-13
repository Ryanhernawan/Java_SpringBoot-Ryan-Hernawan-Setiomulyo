package com.alterra.Task26.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "transaction")
public class TransactionModel {
    @Id
    private String id;

    private String customer_name;
    private String  transaction_details;
    private String is_paid;
    private String created_at;
}
