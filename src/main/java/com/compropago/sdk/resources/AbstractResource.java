package com.compropago.sdk.resources;

public abstract class AbstractResource {

    protected String apiUrl;

    protected String publicKey;

    protected String privateKey;

    public String getPublicKey() {
        return publicKey;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void withKeys(String publicKey, String privateKey) {
        this.publicKey = publicKey;
        this.privateKey = privateKey;
    }
}
