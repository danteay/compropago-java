package com.compropago.sdk.tests;

import com.compropago.sdk.Client;
import com.compropago.sdk.resources.payments.*;
import com.compropago.sdk.resources.*;
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

    @DisplayName("Spei instance creation")
    @Test
    void testCreateSpeiInstance() {
        Spei spei = instance.getResourceSpei();
        Assertions.assertEquals(spei.getPublicKey(), PUBLIC_KEY);
        Assertions.assertEquals(spei.getPrivateKey(), PRIVATE_KEY);
    }

    @DisplayName("SMS instance creation")
    @Test
    void testCreateSmsInstance() {
        Sms sms = instance.getResourceSms();
        Assertions.assertEquals(sms.getPublicKey(), PUBLIC_KEY);
        Assertions.assertEquals(sms.getPrivateKey(), PRIVATE_KEY);
    }


    @DisplayName("Webhook instance creation")
    @Test
    void testCreateWebhookInstance() {
        Webhook wh = instance.getResourceWebhook();
        Assertions.assertEquals(wh.getPublicKey(), PUBLIC_KEY);
        Assertions.assertEquals(wh.getPrivateKey(), PRIVATE_KEY);
    }
}
