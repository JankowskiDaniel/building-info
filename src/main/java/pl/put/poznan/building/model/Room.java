package pl.put.poznan.building.model;

import java.util.ArrayList;

public class Room extends BuildingComponent {

    private float area;
    private float volume;
    private float lightingpower;

    public Room( String id){
        super(id);
    }


    /**
     * Calculate area of room
     */
    public void calculateArea() {
        this.area = 0.0F;
    }

    /**
     * Calculating volume for room
     */
    public void calculateVolume() {
        this.volume = 0.0F;
    }

    /**
     * Calculating lighting power of room
     */
    public void calculateLightingpower() {
        this.lightingpower = 0.0F;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public float getLightingpower() {
        return lightingpower;
    }

    public void setLightingpower(float lightingpower) {
        this.lightingpower = lightingpower;
    }
}
