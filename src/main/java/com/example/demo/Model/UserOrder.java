package com.example.demo.Model;

import lombok.Data;

@Data
public class UserOrder {
    private String userId;
    private String productId;
    private String orderNum;
}
