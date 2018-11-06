package com.compropago.sdk.resources.models;

public class OrderInfo {

    private String orderId;
    private String orderName;
    private double orderPrice;
    private String currency;
    private String clientName;
    private String clientEmail;
    private String clientPhone;
    private String paymentType;
    private String imageUrl;

    public String getOrderId() {
        return orderId;
    }

    public OrderInfo setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public String getOrderName() {
        return orderName;
    }

    public OrderInfo setOrderName(String orderName) {
        this.orderName = orderName;
        return this;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public OrderInfo setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public OrderInfo setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public String getClientName() {
        return clientName;
    }

    public OrderInfo setClientName(String clientName) {
        this.clientName = clientName;
        return this;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public OrderInfo setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
        return this;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public OrderInfo setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
        return this;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public OrderInfo setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public OrderInfo setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
}
