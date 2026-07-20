package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
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
    public Model Create(@Valid @RequestBody Model body){
        return service.create(body);
    } 

    @GetMapping("/{id}")
    public Model Read(@PathVariable Long id){
        return service.getById(id);

    }

    @GetMapping("/Read")
    public List<Model> Read(){
        return service.getAll();
    }

    @PutMapping("/{id}")
    public Model Update(@Valid @PathVariable Long id , @Valid @RequestBody Model body ){
        return service.update(id, body);
    }

    @DeleteMapping("/{id}")
    public void Delete(@PathVariable Long id){
         service.deletebyid(id);
    }

    @DeleteMapping("/Delete")
    public void Delete() {
        service.deleteall();

    }
}
