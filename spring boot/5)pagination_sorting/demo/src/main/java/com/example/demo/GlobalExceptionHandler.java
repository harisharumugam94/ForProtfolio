package com.example.demo;

import java.util.Map;
import java.util.HashMap;
import java.time.LocalDateTime;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String , Object>> handleValidationError(MethodArgumentNotValidException ex){
        Map<String,Object> Body= new HashMap<>();
        Body.put("timestramp", LocalDateTime.now());
        Body.put("status", HttpStatus.BAD_REQUEST);
        Body.put("error",ex.getBindingResult().getFieldError().getDefaultMessage());
        return new ResponseEntity<>(Body,HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Map<String,Object>> handleRunTimeError(RuntimeException ex){
        Map<String,Object> Body = new HashMap<>();
        Body.put("timestramp", LocalDateTime.now());
        Body.put("status",HttpStatus.NOT_FOUND.value());
        Body.put("error",ex.getMessage());
        return new ResponseEntity<>(Body , HttpStatus.NOT_FOUND);

    }


    
}
