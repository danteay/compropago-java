package com.compropago.sdk.helpers;

import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.HttpResponse;
import com.compropago.sdk.exceptions.RequestValidationException;
import org.json.JSONObject;

public class ValidationHelper {

    public static void validateResponse(HttpResponse<JsonNode> resp) throws RequestValidationException {
        JSONObject body = resp.getBody().getObject();
        String altCode = "code";

        if (resp.getStatus() != 200) {
            String message = "Request error [" + resp.getStatus() + "]: " + body;
            throw new RequestValidationException(message, resp.getStatus());
        } else if (body.has(altCode) && (Integer) body.get(altCode) != 200) {
            String message = "Request error [" + body.get(altCode) + "]: " + body;
            throw new RequestValidationException(message, resp.getStatus());
        }
    }
}
