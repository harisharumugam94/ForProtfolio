package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserService {

    @Autowired
    private  UserRepository userRepository;

    public UserResponse register (@RequestBody RegisterRequest body){
        UserModel model = new UserModel();
        model.setUsername(body.getUsername());
        model.setEmail(body.getEmail());
        model.setPassword(body.getPassword());
        return toResponse(model);


        
    }






     private UserResponse toResponse(UserModel model){
        return new UserResponse( 
        model.getUsername(),
        model.getEmail()
    );
}

   


}
