package com.example.demo.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class ProductResponse {
    private Long id;
    private String name;
    private Long price;
    private Long quantity;
    private Long userId;
    private String username;
    
}
