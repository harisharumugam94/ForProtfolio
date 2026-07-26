package com.example.demo;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.example.demo.user.*;
import com.example.demo.CustomUserDetails;

@Service
public class CustomUserDetailsService implements UserDetailsService{

    private final UserRepository userRepository;

    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
     @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserModel user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found: " + username));
        return new CustomUserDetails(user);
    }
    



    
    }


   
    

    

