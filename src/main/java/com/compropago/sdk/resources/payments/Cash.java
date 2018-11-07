package com.compropago.sdk.resources.payments;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.compropago.sdk.exceptions.RequestValidationException;
import com.compropago.sdk.helpers.ValidationHelper;
import com.compropago.sdk.resources.AbstractResource;
import com.compropago.sdk.resources.models.OrderInfo;
import org.json.JSONArray;
import org.json.JSONObject;

public class Cash extends AbstractResource {

    /**
     * Cash Constructor
     */
    public Cash() {
        this.apiUrl = "https://api.compropago.com/v1";
    }

    /**
     * Generate a rest resquest to the ComproPago API to retrive the list of default providers
     *
     * @return Json Array with the list of all providers
     *
     * @throws UnirestException Request Exception
     * @throws RequestValidationException Data validation exception
     */
    public JSONArray getDefaultProviders() throws UnirestException, RequestValidationException {
        String url = this.apiUrl + "/providers/true";

        HttpResponse<JsonNode> resp = Unirest.get(url).asJson();
        ValidationHelper.validateResponse(resp);

        return resp.getBody().getArray();
    }

    /**
     * Generate a rest resquest to the ComproPago API to retrive the providers list of the actual account
     *
     * @return Json Array with the providers list
     *
     * @throws UnirestException Request Exception
     * @throws RequestValidationException Data validation exception
     */
    public JSONArray getProviders() throws UnirestException, RequestValidationException {
        String url = this.apiUrl + "/providers";

        HttpResponse<JsonNode> resp = Unirest.get(url)
                .basicAuth(this.privateKey, this.publicKey)
                .asJson();

        ValidationHelper.validateResponse(resp);

        return resp.getBody().getArray();
    }

    /**
     * Generate a rest resquest to the ComproPago API to retrive the providers list of the actual account
     *
     * @param limit Minimum amoun that should support the retrived providers
     *
     * @return Json Array with the providers list
     *
     * @throws UnirestException Request Exception
     * @throws RequestValidationException Data validation exception
     */
    public JSONArray getProviders(float limit) throws UnirestException, RequestValidationException {
        String url = this.apiUrl + "/providers";

        HttpResponse<JsonNode> resp = Unirest.get(url)
                .basicAuth(this.privateKey, this.publicKey)
                .queryString("order_total", limit)
                .asJson();

        ValidationHelper.validateResponse(resp);

        return resp.getBody().getArray();
    }

    /**
     * Generate a rest resquest to the ComproPago API to retrive the providers list of the actual account
     *
     * @param limit Minimum amoun that should support the retrived providers
     * @param currency Currency of the limit. This can be MXN, USD, EUR GBP
     *
     * @return Json Array with the providers list
     *
     * @throws UnirestException Request Exception
     * @throws RequestValidationException Data validation exception
     */
    public JSONArray getProviders(float limit, String currency) throws UnirestException, RequestValidationException {
        String url = this.apiUrl + "/providers";

        HttpResponse<JsonNode> resp = Unirest.get(url)
                .basicAuth(this.privateKey, this.publicKey)
                .queryString("order_total", limit)
                .queryString("currency", currency.toUpperCase())
                .asJson();

        ValidationHelper.validateResponse(resp);

        return resp.getBody().getArray();
    }

    /**
     * Generate a rest request to the ComproPago API to register a new Cash order
     *
     * @param order OrderInfo object with the necesary information of the order
     *
     * @return Json object with the resultant information of the order creation
     *
     * @throws UnirestException Request Exception
     * @throws RequestValidationException Data validation exception
     */
    public JSONObject createOrder(OrderInfo order) throws UnirestException, RequestValidationException {
        String url = this.apiUrl + "/charges";

        JSONObject data = new JSONObject();
        data.append("order_id", order.getOrderId());
        data.append("order_name", order.getOrderName());
        data.append("order_price", order.getOrderPrice());
        data.append("currency", order.getCurrency());
        data.append("client_name", order.getClientName());
        data.append("client_email", order.getClientEmail());
        data.append("client_phone", order.getClientPhone());
        data.append("image_url", order.getImageUrl());
        data.append("payment_type", order.getPaymentType());

        HttpResponse<JsonNode> resp = Unirest.post(url)
                .basicAuth(this.privateKey, this.publicKey)
                .header("Content-Type", "application/json")
                .body(data)
                .asJson();

        ValidationHelper.validateResponse(resp);

        return resp.getBody().getObject();
    }

    public JSONObject verifyOrder(String id) throws UnirestException, RequestValidationException {
        String url = this.apiUrl + "/charges/{orderId}";

        return null;
    }
}
