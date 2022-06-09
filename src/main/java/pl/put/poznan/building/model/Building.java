package pl.put.poznan.building.model;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

/**
 * Class for buildings
 */
public class Building extends BuildingComponent{

    /**
     * Array with all levels, which are in this building
     */
    @JsonProperty("levels")
    private ArrayList<Level> levels;

    @JsonProperty("heatlimit")
    private double heatlimit;



    /**
     * Calculating area of the building
     * @return area of the building
     */
    public double calculateArea(){
        double sum=0;
        for (int i=0; i<levels.size();i++){
            sum+=levels.get(i).calculateArea();
        }
        return sum;
    }

    /**
     * Calculating volume of the building
     * @return volume of the building
     */
    public double calculateVolume(){
        double sum=0;
        for (int i=0; i<levels.size();i++){
            sum+=levels.get(i).calculateVolume();
        }
        return sum;
    }

    /**
     * Calculating sum of light power of the building
     * @return sum of light power values
     */
    public double sumLightPower(){
        double sum=0.0;
        for(int i=0;i<levels.size(); i++){
            sum+=levels.get(i).sumLightPower();
        }
        return sum;
    }
    /**
     * Calculating lighting power of building per m^2
     * @return lighting power
     */
    public double calculateLightPower(){
        return sumLightPower()/calculateArea();
    }

    public double calculateConsumption(){return 0.0;}

    public int calculateExtinguisher(){
        int sum = 0;
        for(int i=0; i< levels.size(); i++){
            sum+=levels.get(i).calculateExtinguisher();
        }
        return sum;
    }


}
