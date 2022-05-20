package pl.put.poznan.building.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class BuildingComponent implements BuildingSpace{

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;



    public double calculateArea(){
        return 0.0;};
    public double calculateVolume(){
        return 0.0;};
    public double calculateLightingpower(){
        return 0.0;};

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
