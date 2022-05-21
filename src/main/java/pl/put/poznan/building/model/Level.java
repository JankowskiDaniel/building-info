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


    public double sumLightPower(){
        double sum=0.0;
        for(int i=0;i<rooms.size(); i++){
            sum+=rooms.get(i).getLightingpower();
        }
        return sum;
    }
    /**
     * Calculating lighting power of level
     * @return
     */
    public double calculateLightPower(){
        return sumLightPower()/calculateArea();
    }

}
