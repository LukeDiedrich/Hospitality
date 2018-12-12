package com.lukediedrich.hospitality;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.lukediedrich.hospitality.model.StatesData;

import java.io.IOException;
import java.net.URL;

public class StatesObjectMapper
{
    public StatesData readJsonWithObjectMapper() throws IOException
    {
        ObjectMapper objectMapper = new ObjectMapper();

        URL url = new URL("http://services.groupkt.com/state/get/USA/all");
        StatesData statesData = objectMapper.readValue(url, StatesData.class);

        return statesData;
    }
}
