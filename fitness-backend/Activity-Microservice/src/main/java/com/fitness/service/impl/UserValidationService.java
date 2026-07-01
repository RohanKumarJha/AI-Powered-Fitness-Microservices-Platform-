package com.fitness.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;

@Service
@RequiredArgsConstructor
public class UserValidationService {

    private final WebClient userValidate;

    public boolean validateUser(String userId) {
        try{
            System.out.println("hi");
            return Boolean.TRUE.equals(userValidate.get()
                    .uri("/api/users/{userId}/validate", userId)
                    .retrieve()
                    .bodyToMono(Boolean.class)
                    .block());
        } catch (WebClientResponseException e) {
            e.printStackTrace();
        }
        return false;
    }
}
