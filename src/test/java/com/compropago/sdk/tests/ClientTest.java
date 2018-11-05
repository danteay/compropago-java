package com.compropago.sdk.tests;

import com.compropago.sdk.Client;
import com.compropago.sdk.resources.payments.Cash;
import com.compropago.sdk.tests.config.TestConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ClientTest extends TestConfig {

    private Client instance;

    @BeforeEach
    void setUpClient() {
        instance = new Client(PUBLIC_KEY, PRIVATE_KEY);
    }

    @DisplayName("Client instance creation")
    @Test
    void testCreateInstance() {
        Assertions.assertEquals(instance.getPublicKey(), PUBLIC_KEY);
        Assertions.assertEquals(instance.getPrivateKey(), PRIVATE_KEY);
    }

    @DisplayName("Cash instance creation")
    @Test
    void testCreateCashInstance() {
        Cash cash = instance.getResourceCash();
        Assertions.assertEquals(cash.getPublicKey(), PUBLIC_KEY);
        Assertions.assertEquals(cash.getPrivateKey(), PRIVATE_KEY);
    }
}
