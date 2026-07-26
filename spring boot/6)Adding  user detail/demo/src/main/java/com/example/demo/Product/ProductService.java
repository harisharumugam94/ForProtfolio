package com.example.demo.Product;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.user.UserModel;
import com.example.demo.user.UserRepository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
@Service
public class ProductService {

    @Autowired
    private  ProductRepository repository;

    @Autowired
    private UserRepository userRepository;

    //create
    public ProductResponse create(ProductRequest product){

         UserModel user = userRepository.findById(product.getUserId()).orElseThrow(() -> new RuntimeException("User not found " + product.getUserId()));

        Model model= new Model();
        model.setName(product.getName());
        model.setPrice(product.getPrice());
        model.setQuantity(product.getQuantity());
        model.setUser(user);
        Model saved = repository.save(model);
        return toResponse(saved);
    }

    //createbulkrecord
    public List<ProductResponse> createbulkList(List<ProductRequest> product){
        
       List<Model> model = product.stream().map(r -> {
        UserModel user = userRepository.findById(r.getUserId())  
                .orElseThrow(() -> new RuntimeException("User not found " + r.getUserId()));

        Model m = new Model();
        m.setName(r.getName());
        m.setPrice(r.getPrice());
        m.setQuantity(r.getQuantity());
        m.setUser(user);
        return m;
    }).toList();
        return repository.saveAll(model).stream().map(this::toResponse).toList();

    }

    //readbyid
    public ProductResponse getById( Long id){
        Model model = repository.findById(id).orElseThrow(() -> new RuntimeException("product not found " + id));
       return toResponse(model);
    }
    
    //readall
    public Page<ProductResponse> getAll(Pageable pageable){
        return repository.findAll(pageable).map(this :: toResponse);

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
        product.getQuantity(),
        product.getUser().getId(),
        product.getUser().getUsername() 
    );

    }
}
