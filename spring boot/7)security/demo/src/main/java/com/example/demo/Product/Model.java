package com.example.demo.Product;

import com.example.demo.user.UserModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Entity
@Table(name="products")
@Data
public class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message="it should not be blank")
    private String name;
    @Positive(message="the number should be positive")
    private Long price;
    @Min(value=0, message = "it should be positive or zero")
    private Long quantity;

    @ManyToOne
    @JoinColumn(name= "user_id" , nullable = false)
    private UserModel user;

}
