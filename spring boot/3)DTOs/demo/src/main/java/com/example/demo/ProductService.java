package com.example.demo;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private  ProductRepository repository;

    //create
    public ProductResponse create(ProductRequest product){

        Model model= new Model();
        model.setName(product.getName());
        model.setPrice(product.getPrice());
        model.setQuantity(product.getQuantity());
        return toResponse(model);
    }

    //readbyid
    public ProductResponse getById( Long id){
        Model model = repository.findById(id).orElseThrow(() -> new RuntimeException("product not found " + id));
       return toResponse(model);
    }
    
    //readall
    public List<ProductResponse> getAll(){
        return repository.findAll().stream().map(this :: toResponse).toList();

    } 

    //update
    public ProductResponse update(Long id ,ProductRequest product){
        Model ex =  repository.findById(id).orElseThrow(() -> new RuntimeException("product not found " + id));
        ex.setName(product.getName());
        ex.setPrice(product.getPrice());
        ex.setQuantity(product.getQuantity());
        return toResponse(repository.save(ex));
    }

    //deletebyid

    public void deletebyid(Long id ){
         repository.deleteById(id);
    }
    public void deleteall(){
        repository.deleteAll(null);
    }


    private ProductResponse toResponse(Model product){
        return new ProductResponse(product.getId(),
        product.getName(),
        product.getPrice(),
        product.getQuantity()
    );

    }
}
