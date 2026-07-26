package com.example.demo.user;
import com.example.demo.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserService {

   
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder, JwtUtil jwtUtil) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtUtil = jwtUtil;
    }
   
    public UserResponse register (RegisterRequest body){
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
        model.setPassword(passwordEncoder.encode(body.getPassword()));
        return toResponse(userRepository.save(model));


        
    }
    public LoginResponse login (LoginRequest body){

        UserModel user= userRepository.findByUsername(body.getUsername()).orElseThrow(()-> new  RuntimeException("user not found"));

        if( !passwordEncoder.matches(body.getPassword(), user.getPassword())){

            throw new RuntimeException("password not match");
        }


        String token = jwtUtil.generateToken(user.getUsername());

        return new LoginResponse(user.getUsername() , token);


    }







     private UserResponse toResponse(UserModel model){
        return new UserResponse( 
        model.getUsername(),
        model.getEmail()
    );
}

   


}
