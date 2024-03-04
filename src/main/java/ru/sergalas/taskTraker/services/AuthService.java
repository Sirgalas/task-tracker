package ru.sergalas.taskTraker.services;

import ru.sergalas.taskTraker.web.dto.auth.JwtRequest;
import ru.sergalas.taskTraker.web.dto.auth.JwtResponse;

public interface AuthService {

    JwtResponse login(JwtRequest jwtRequest);

    JwtResponse refresh(String refreshToken);
}
