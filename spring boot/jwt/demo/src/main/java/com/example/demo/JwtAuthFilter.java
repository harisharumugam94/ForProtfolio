package com.example.demo;
import org.springframework.web.filter.OncePerRequestFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;

import jakarta.servlet.FilterChain;
import jakarta.servlet.http.HttpServletRequest;

@Component
public class JwtAuthFilter extends OncePerRequestFilter{
    
    private final JwtUtil jwtUtil;
    private final CustomUserDetailsService userDetailsService;
    public JwtAuthFilter(JwtUtil jwtUtil, CustomUserDetailsService userDetailsService) {
        this.jwtUtil = jwtUtil;
        this.userDetailsService = userDetailsService;
    }
    protected void doFilterInternal(
			HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException{

                String authHeader = request.getHeader("Authorization");

                if(authHeader==null|| !authHeader.startsWith("Bearer ")){
                    filterChain.doFilter(request, response);
                    return;
                }

                String token = authHeader.substring(7);
                String username = jwtUtil.extractUsername(token);

                if(jwtUtil.validateToken(token, username)){

                    
                    UserDetails userDetails  = userDetailsService.loadUserByUsername(username);

                    UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(userDetails , null,userDetails.getAuthorities());
                    authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                    SecurityContextHolder.getContext().setAuthentication(authToken);
                }

                filterChain.doFilter(request, response);
                



            }


            }




    

