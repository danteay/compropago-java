package com.compropago.sdk;

import com.compropago.sdk.resources.Resource;
import com.compropago.sdk.resources.payments.*;

public class Client {

    private String publicKey;

    private String privateKey;

    public Client() {}

    public Client(String publicKey, String privateKey) {
        this.publicKey = publicKey;
        this.privateKey = privateKey;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public Client withKeys(String publicKey, String privateKey) {
        this.publicKey = publicKey;
        this.privateKey = privateKey;
        return this;
    }

    public Resource getResource(Class className) {
        switch (className.getName()) {
            case "com.compropago.sdk.resoruces.payments.Cash":
                Cash resoruce = (new Cash());
        }

        return null;
    }
}
