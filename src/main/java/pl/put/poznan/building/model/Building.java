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

    private ArrayList<String> wrongrooms;

    public void HeatingLimitRooms(){
        for (int i=0; i<levels.size(); i++){
            Level lvl=levels.get(i);
            for (int j=0; j<lvl.getRooms().size();j++){
                Room rm=lvl.getRooms().get(j);
                if (rm.calculateConsumption()>heatlimit){
                    wrongrooms.add(rm.getName());
                }
        }
    }
    }
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
     * Calculating sum of heating energy consumption of the building
     * @return sum of heating energy consumption
     */
    public double sumHeatingenergy(){
        double sum=0.0;
        for(int i=0;i<levels.size(); i++){
            sum+=levels.get(i).sumHeatingenergy();
        }
        return sum;
    }
    /**
     * Calculating average heating energy consumption of the building per m^3
     * @return sum of heating energy consumption
     */
    public double calculateConsumption(){
        return sumHeatingenergy()/calculateVolume();
    }
    /**
     * Calculating lighting power of building per m^2
     * @return lighting power
     */
    public double calculateLightPower(){
        return sumLightPower()/calculateArea();
    }

    public int calculateExtinguisher(){
        int sum = 0;
        for(int i=0; i< levels.size(); i++){
            sum+=levels.get(i).calculateExtinguisher();
        }
        return sum;
    }
}
