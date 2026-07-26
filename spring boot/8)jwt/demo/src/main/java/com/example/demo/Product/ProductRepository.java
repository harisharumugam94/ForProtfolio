package com.example.demo.Product;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Model , Long> {

    List<Model> findByUser_Username(String username);

    
    
}