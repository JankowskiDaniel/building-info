package pl.put.poznan.building.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Level extends BuildingComponent{

    @JsonProperty("rooms")
    private ArrayList<Room> rooms;

    /**
     * Calculate area of level
     */
    public double calculateArea(){

        return 0.0;
    }

    /**
     * Calculating volume for level
     */
    public double calculateVolume(){
        return 0.0;
    }

    /**
     * Calculating lighting power of level
     * @return
     */
    public double calculateLightPower(){

        return 0.0;
    }

}
