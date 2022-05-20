package pl.put.poznan.building.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Room extends BuildingComponent{

    @JsonProperty("area")
    private double area;

    @JsonProperty("volume")
    private double volume;

    @JsonProperty("lightingpower")
    private double lightingpower;

    public double getArea() {
        return area;
    }


    public double getVolume() {
        return volume;
    }


    public double getLightingpower() {
        return lightingpower;
    }


}
