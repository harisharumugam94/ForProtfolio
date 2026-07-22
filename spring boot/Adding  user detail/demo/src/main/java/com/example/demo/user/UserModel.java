package com.example.demo.user;

import java.util.List;

import com.example.demo.Product.Model;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserModel{
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "It should not be blank")
    @Size(min=6 , max = 100 , message = "it should be more then or equal to six character")
    private String username;

    @Email(message= "it should be in email form")
    @NotBlank(message = "it should not be blank")
    private String email;

    @Size(min=6 , max = 20 , message= "it should be more then or equal to six character")
    @NotBlank(message= "ot should not be blank")
    private String password; 

    @OneToMany(mappedBy = "user" , cascade = CascadeType.ALL , orphanRemoval = true)
    private List<Model> products;
    

}