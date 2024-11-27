package org.bvega;

import org.bvega.models.JWT;
import org.bvega.proxy.JWTServiceProxy;
import org.bvega.service.JWTService;

import java.util.logging.Logger;

public class Main {

    private static final Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws InterruptedException {
        JWTService proxy = new JWTServiceProxy();

        JWT jwt = proxy.requestJWT();
        log.info("TOKEN: " + jwt.token());

        jwt = proxy.requestJWT();
        log.info("TOKEN TWO: " + jwt.token());

        Thread.sleep(5000);

        jwt = proxy.requestJWT();
        log.info("TOKEN THREE: " + jwt.token());

    }
}