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
        return 0.0;
    }

    /**
     * Calculating volume for building
     */
    public double calculateVolume(){
        return 0.0;
    }

    /**
     * Calculating lighting power of building
     * @return
     */
    public double calculateLightingpower(){
        return 0.0;
    }


}
