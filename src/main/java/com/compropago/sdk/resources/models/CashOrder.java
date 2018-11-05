package com.compropago.sdk.resources.models;

public class CashOrder {

    private String orderId;
    private String orderName;
    private float orderPrice;
    private String currency;
    private String clientName;
    private String clientEmail;
    private String clientPhone;
    private String paymentType;
    private String imageUrl;

    public String getOrderId() {
        return orderId;
    }

    public CashOrder setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public String getOrderName() {
        return orderName;
    }

    public CashOrder setOrderName(String orderName) {
        this.orderName = orderName;
        return this;
    }

    public float getOrderPrice() {
        return orderPrice;
    }

    public CashOrder setOrderPrice(float orderPrice) {
        this.orderPrice = orderPrice;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public CashOrder setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public String getClientName() {
        return clientName;
    }

    public CashOrder setClientName(String clientName) {
        this.clientName = clientName;
        return this;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public CashOrder setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
        return this;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public CashOrder setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
        return this;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public CashOrder setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public CashOrder setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
}
