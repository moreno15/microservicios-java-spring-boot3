package com.service.cliente.security.service;

import com.service.cliente.security.dao.request.SignUpRequest;
import com.service.cliente.security.dao.request.SigninRequest;
import com.service.cliente.security.dao.response.JwtAuthenticationResponse;
 

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SigninRequest request);
}
