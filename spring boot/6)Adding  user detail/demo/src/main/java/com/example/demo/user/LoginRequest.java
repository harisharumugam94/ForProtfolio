package com.example.demo.user;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class LoginRequest {
    @NotBlank(message = "It should not be blank")
    @Size(min=6 , max = 100 , message = "it should be more then or equal to six character")
    private String username;

    @Size(min=6 , max = 20 , message= "it should be more then or equal to six character")
    @NotBlank(message= "ot should not be blank")
    private String password; 
    
}
