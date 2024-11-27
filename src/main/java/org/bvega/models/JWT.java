package org.bvega.models;

public record JWT(String token, long expirationTime, long creationTime) {
    public boolean validateJWT(){
        long currentTimeInSeconds = System.currentTimeMillis() / 1000;
        return currentTimeInSeconds < this.creationTime() + this.expirationTime();
    }
}
