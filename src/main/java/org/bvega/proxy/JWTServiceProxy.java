package org.bvega.proxy;

import org.bvega.models.JWT;
import org.bvega.service.JWTService;
import org.bvega.service.impl.JWTServiceImpl;

public class JWTServiceProxy implements JWTService {

    private final JWTService jwtService;
    private JWT jwt;

    public JWTServiceProxy() {
        this.jwtService = new JWTServiceImpl();
    }

    @Override
    public JWT requestJWT() {
        if (jwt == null || !jwt.validateJWT()) {
            jwt = jwtService.requestJWT();
        }
        return jwt;
    }
}
