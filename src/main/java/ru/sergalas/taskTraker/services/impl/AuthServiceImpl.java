package ru.sergalas.taskTraker.services.impl;

import org.springframework.stereotype.Service;
import ru.sergalas.taskTraker.services.AuthService;
import ru.sergalas.taskTraker.web.dto.auth.JwtRequest;
import ru.sergalas.taskTraker.web.dto.auth.JwtResponse;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public JwtResponse login(JwtRequest jwtRequest) {
        return null;
    }

    @Override
    public JwtResponse refresh(String refreshToken) {
        return null;
    }
}
