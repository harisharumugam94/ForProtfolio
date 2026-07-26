package com.example.demo;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private  ProductRepository repository;

    //create
    public Model create(Model product){

        return repository.save(product);
    }

    //readbyid
    public Model getById( Long id){

       return repository.findById(id).orElseThrow(() -> new RuntimeException("product not found " + id));
    }
    
    //readall
    public List<Model> getAll(){
        return repository.findAll();

    } 

    //update
    public Model update(Long id , Model product){
        Model ex = getById(id);
        ex.setName(product.getName());
        ex.setPrice(product.getPrice());
        ex.setQuantity(product.getQuantity());
        return repository.save(ex);
    }

    //deletebyid

    public void deletebyid(Long id ){
         repository.deleteById(id);
    }
    public void deleteall(){
        repository.deleteAll(null);
    }
}
