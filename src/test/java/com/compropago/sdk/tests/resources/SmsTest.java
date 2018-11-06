package com.compropago.sdk.tests.resources;

import com.compropago.sdk.Client;
import com.compropago.sdk.resources.models.OrderInfo;
import com.compropago.sdk.tests.config.TestConfig;
import org.json.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SmsTest extends TestConfig {

    Client instance;

    @BeforeEach
    void setUpInstance() {
        this.instance = new Client(PUBLIC_KEY, PRIVATE_KEY);
    }

    @DisplayName("SMS instance creation")
    @Test
    void testSendSms() {

    }

    JSONObject createOrder() {
        double random = Math.random();

        OrderInfo order = new OrderInfo()
                .setOrderId("123")
                .setOrderName("Test java")
                .setOrderPrice(123.45)
                .setCurrency("")
                .setClientName("")
                .setClientEmail("")
                .setPaymentType("");

        return null;
    }
}
