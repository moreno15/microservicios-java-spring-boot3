package com.service.caja.security.service;

import com.service.caja.security.dao.request.SignUpRequest;
import com.service.caja.security.dao.request.SigninRequest;
import com.service.caja.security.dao.response.JwtAuthenticationResponse;
 

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SigninRequest request);
}
