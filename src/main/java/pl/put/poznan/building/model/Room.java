package pl.put.poznan.building.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

/**
 * Class for representing room
 */
public class Room{

    public Room(double area, double volume, double lightingpower) {
        this.area = area;
        this.volume = volume;
        this.lightingpower = lightingpower;
    }

    @JsonProperty("area")
    private double area;

    @JsonProperty("volume")
    private double volume;

    @JsonProperty("lightingpower")
    private double lightingpower;

    public void setArea(double area) {
        this.area = area;
    }


    public void setVolume(double volume) {
        this.volume = volume;
    }


    public void setLightingpower(double lightingpower) {
        this.lightingpower = lightingpower;
    }

    public double getArea() {
        return area;
    }


    public double getVolume() {
        return volume;
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


}
