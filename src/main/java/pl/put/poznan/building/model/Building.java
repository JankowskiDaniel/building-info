package pl.put.poznan.building.model;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Building extends BuildingComponent{

    //list with levels in building
    @JsonProperty("levels")
    private ArrayList<Level> levels;


    //wszystkie trzy ponizsze funkcje beda zadeklarowane w interfejsie i są one wspólne dla pozostałych modeli

    /**
     * Calculate area of building
     */
    public double calculateArea(){
        double sum=0;
        for (int i=0; i<levels.size();i++){
            sum+=levels.get(i).calculateArea();
        }
        return sum;
    }

    /**
     * Calculating volume for building
     */
    public double calculateVolume(){
        double sum=0;
        for (int i=0; i<levels.size();i++){
            sum+=levels.get(i).calculateVolume();
        }
        return sum;
    }

    public double sumLightPower(){
        double sum=0.0;
        for(int i=0;i<levels.size(); i++){
            sum+=levels.get(i).sumLightPower();
        }
        return sum;
    }
    /**
     * Calculating lighting power of building
     * @return
     */
    public double calculateLightPower(){
        return sumLightPower()/calculateArea();
    }


}
