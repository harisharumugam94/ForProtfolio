package com.example.demo.Product;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class ProductRequest {

   
   

    @NotBlank(message="it should not be blank")
    private String name;
    @Positive(message = "it should be in the positive")
    private Long price;
    @Min(value = 0 , message= "it should be positive or zero")
    private Long quantity;
    
    private Long userId;
    
}
