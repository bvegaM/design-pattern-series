package org.bvega.service.impl;

import org.bvega.models.JWT;
import org.bvega.service.JWTService;

import java.util.UUID;

public class JWTServiceImpl implements JWTService {
    @Override
    public JWT requestJWT() {
        return new JWT(generateToken(), 5,
                System.currentTimeMillis() / 1000);
    }

    private String generateToken(){
        String header = UUID.randomUUID().toString();

        String payload = UUID.randomUUID().toString();

        String signature = UUID.randomUUID().toString();

        return header + "." + payload +
                "." + signature;
    }
}
