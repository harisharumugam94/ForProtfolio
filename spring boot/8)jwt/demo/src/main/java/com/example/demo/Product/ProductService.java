package com.example.demo.Product;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
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
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        UserModel user = userRepository.findByUsername(username)
        .orElseThrow(() -> new RuntimeException("User not found: " + username));


        Model model= new Model();
        model.setName(product.getName());
        model.setPrice(product.getPrice());
        model.setQuantity(product.getQuantity());
        model.setUser(user);
        Model saved = repository.save(model);
        return toResponse(saved);
    }

    //createbulkrecord
    public List<ProductResponse> createbulkList(List<ProductRequest> product) {
    String username = SecurityContextHolder.getContext().getAuthentication().getName();
    UserModel user = userRepository.findByUsername(username)
        .orElseThrow(() -> new RuntimeException("User not found: " + username));

    List<Model> model = product.stream().map(r -> {
        Model m = new Model();
        m.setName(r.getName());
        m.setPrice(r.getPrice());
        m.setQuantity(r.getQuantity());
        m.setUser(user);
        return m;
    }).toList();
    return repository.saveAll(model).stream().map(this::toResponse).toList();
}

    public List<ProductResponse> getMyProducts() {
    String username = SecurityContextHolder.getContext().getAuthentication().getName();
    List<Model> products = repository.findByUser_Username(username);
    return products.stream().map(this::toResponse).toList();
}


    private ProductResponse toResponse(Model product){
        return new ProductResponse(product.getId(),
        product.getName(),
        product.getPrice(),
        product.getQuantity()
    );

    }
}
