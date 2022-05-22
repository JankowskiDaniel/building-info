package pl.put.poznan.building.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An abstract class that describes what the building components
 * (including whole buildings) are made of
 */
public abstract class BuildingComponent implements BuildingSpace{

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;


    /**
     * @return Area of the component
     */
    public double calculateArea(){
        return 0.0;};

    /**
     *
     * @return Volume of the component
     */
    public double calculateVolume(){
        return 0.0;};

    /**
     *
     * @return Lighting power per m^2 of the component
     */
    public double calculateLightPower(){
        return 0.0;};

    /**
     *
     * @return Lighting power
     */
    public double sumLightPower(){
        return 0.0;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
