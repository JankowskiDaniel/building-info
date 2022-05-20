package pl.put.poznan.building.model;

public class Room implements BuildingSpace {
    private float area;
    private float volume;
    private float lightingpower;
    /**
     * Calculate area of building
     */
    public void calculateArea(){
        this.area = 0.0F;
    }

    /**
     * Calculating volume for building
     */
    public void calculateVolume(){
        this.volume = 0.0F;
    }

    /**
     * Calculating lighting power of building
     */
    public void calculateLightingpower(){
        this.lightingpower = 0.0F;
    }

}
