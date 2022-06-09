package pl.put.poznan.building.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

/**
 * Class for Level, which is part of the building
 */
public class Level extends BuildingComponent{

    /**
     * Array of all rooms, which are on this floor
     */
    @JsonProperty("rooms")
    private ArrayList<Room> rooms;

    /**
     * Calculate area of level
     */
    public double calculateArea(){
        double sum=0.0;
        for(int i=0;i<rooms.size(); i++){
            sum+=rooms.get(i).getArea();
        }
        return sum;
    }

    /**
     * Calculating volume for level
     */
    public double calculateVolume(){
        double sum=0.0;
        for(int i=0;i<rooms.size(); i++){
            sum+=rooms.get(i).getVolume();
        }
        return sum;

    }

    /**
     *  Calculating sum of light power of the level
     * @return sum of light power values
     */
    public double sumLightPower(){
        double sum=0.0;
        for(int i=0;i<rooms.size(); i++){
            sum+=rooms.get(i).getLightingpower();
        }
        return sum;
    }
    public double sumheatingenergy(){
        double sum=0.0;
        for(int i=0;i<rooms.size(); i++){
            sum+=rooms.get(i).getHeatingenergy();
        }
        return sum;

    }
    public double calculateConsumption(){return sumheatingenergy()/calculateVolume();}
    /**
     * Calculating lighting power of level
     * @return lighting power per m^2
     */
    public double calculateLightPower(){
        return sumLightPower()/calculateArea();
    }

}
