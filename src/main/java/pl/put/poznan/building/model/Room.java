package pl.put.poznan.building.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

/**
 * Class for representing room
 */
public class Room{

    @JsonProperty("area")
    private double area;

    @JsonProperty("volume")
    private double volume;

    @JsonProperty("lightingpower")
    private double lightingpower;

    @JsonProperty("heatingenergy")
    private double heatingenergy;


    public double getArea() {
        return area;
    }


    public double getVolume() {
        return volume;
    }
    public double getHeatingenergy(){
        return heatingenergy;
    }
    public double calculateConsumption(){
        return heatingenergy/getVolume();
    }

    public double getLightingpower() {
        return lightingpower;
    }

    /**
     * Calculating lighting power per m^2 of the room
     * @return lighting power per m^2
     */
    public double calculateLightPower(){
        return lightingpower/area;
    }
    public int calculateExtinguisher(){return 2;}
}
