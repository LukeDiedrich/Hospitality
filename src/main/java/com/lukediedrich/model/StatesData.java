package com.lukediedrich.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lukediedrich.model.RestResponse;

public class StatesData
{
    @JsonProperty("RestResponse")
    private RestResponse restResponse;

    public RestResponse getRestResponse()
    {
        return restResponse;
    }

    public void setRestResponse(RestResponse restResponse)
    {
        this.restResponse = restResponse;
    }
}
