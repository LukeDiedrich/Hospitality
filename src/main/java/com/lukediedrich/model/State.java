package com.lukediedrich.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class State
{
    @JsonProperty("id")
    private int id;
    @JsonProperty("country")
    private String country;
    @JsonProperty("name")
    private String name;
    @JsonProperty("abbr")
    private String abbr;
    @JsonProperty("area")
    private String area;
    @JsonProperty("largest_city")
    private String largestCity;
    @JsonProperty("capital")
    private String capital;

//    public State(int id, String country, String abbr, String area, String largestCity, String capital)
//    {
//        this.id = id;
//        this.country = country;
//        this.abbr = abbr;
//        this.area = area;
//        this.largestCity = largestCity;
//        this.capital = capital;
//    }


    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public String getAbbr()
    {
        return abbr;
    }

    public void setAbbr(String abbr)
    {
        this.abbr = abbr;
    }

    public String getArea()
    {
        return area;
    }

    public void setArea(String area)
    {
        this.area = area;
    }

    public String getLargestCity()
    {
        return largestCity;
    }

    public void setLargestCity(String largestCity)
    {
        this.largestCity = largestCity;
    }

    public String getCapital()
    {
        return capital;
    }

    public void setCapital(String capital)
    {
        this.capital = capital;
    }
}