package com.compropago.sdk;

import com.compropago.sdk.resources.payments.*;
import com.compropago.sdk.resources.*;

public class Client {

    private String publicKey;

    private String privateKey;

    /**
     * Client Constructor
     *
     * @param publicKey Public key of the ComproPago account
     * @param privateKey Private key of the ComproPago account
     */
    public Client(String publicKey, String privateKey) {
        this.publicKey = publicKey;
        this.privateKey = privateKey;
    }

    /**
     * Returns the configured public key
     *
     * @return Actual public key
     */
    public String getPublicKey() {
        return publicKey;
    }

    /**
     * Returns the configured private key
     *
     * @return Actual private key
     */
    public String getPrivateKey() {
        return privateKey;
    }

    /**
     * Return a configured instance of Cash resource
     *
     * @return Cash resource instance
     */
    public Cash getResourceCash() {
        Cash resource = new Cash();
        resource.withKeys(this.publicKey, this.privateKey);
        return resource;
    }
}
