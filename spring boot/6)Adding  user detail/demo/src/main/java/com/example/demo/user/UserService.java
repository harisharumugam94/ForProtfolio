package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserService {

    @Autowired
    private  UserRepository userRepository;

    public UserResponse register (@RequestBody RegisterRequest body){
        if (userRepository.existsByUsername(body.getUsername())) 
            
            {
             
             
                throw new RuntimeException("Username already taken");


            }
            
    if (userRepository.existsByEmail(body.getEmail())) 
        {
            
            throw new RuntimeException("Email already registered");


        }
        
        
        
        
        UserModel model = new UserModel();
        model.setUsername(body.getUsername());
        model.setEmail(body.getEmail());
        model.setPassword(body.getPassword());
        return toResponse(userRepository.save(model));


        
    }







     private UserResponse toResponse(UserModel model){
        return new UserResponse( 
        model.getUsername(),
        model.getEmail()
    );
}

   


}
