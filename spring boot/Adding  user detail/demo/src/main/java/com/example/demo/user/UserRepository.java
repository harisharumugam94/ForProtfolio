package com.example.demo.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<UserModel , Long>{
    Optional<UserModel> findById(Long id);
    boolean existsById(Long id);

    
} 