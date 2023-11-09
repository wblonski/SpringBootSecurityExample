package com.example.demo.security;

import org.springframework.stereotype.Component;

@Component
public class JwtUtils {

    private String jwtSigningKey = "secret";

    public String extractUsername(String token) {
        return extractClaim(token, Claims::getSubject);
    }

    public String extractExpiration(String token) {

    }


}
