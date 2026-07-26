package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    private  ProductService service;


    @PostMapping("/Create")
    public ResponseEntity<ProductResponse> Create(@Valid @RequestBody ProductRequest body){
        return  ResponseEntity.status(HttpStatus.CREATED).body(service.create(body));
    } 

    @GetMapping("/{id}")
    public ProductResponse Read(@PathVariable Long id){
        return service.getById(id);

    }

    @GetMapping("/Read")
    public List<ProductResponse> Read(){
        return service.getAll();
    }

    @PutMapping("/{id}")
    public ProductResponse Update(@Valid @PathVariable Long id , @Valid @RequestBody ProductRequest body ){
        return service.update(id, body);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> Delete(@PathVariable Long id){
         service.deletebyid(id);
         return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/Delete")
    public void Delete() {
        service.deleteall();

    }
}
