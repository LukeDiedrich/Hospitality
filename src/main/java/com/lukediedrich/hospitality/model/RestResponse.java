package com.lukediedrich.hospitality.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class RestResponse
{

    private List<String> messages;

    private List<State> result;

    public void setMessages(List<String> messages)
    {
        this.messages = messages;
    }

    public  List<String> getMessages()
    {
        return messages;
    }


    public List<State> getResult()
    {
        return result;
    }

    public void setResult(List<State> result)
    {
        this.result = result;
    }
}
