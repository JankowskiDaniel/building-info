package pl.put.poznan.building.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

/**
 * Class for representing room
 */
public class Room extends BuildingComponent{

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


    @JsonProperty("heatingenergy")
    private double heatingenergy;



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
    public double getHeatingenergy(){
        return heatingenergy;
    }
    /**
     * Calculating average heating energy consumption of the building per m^3
     * @return sum of heating energy consumption
     */
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

    public boolean ifAidkit(){
        if(area >= 15.0){
            return true;
        } else {
            return false;
        }
    }
}
