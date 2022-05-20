package pl.put.poznan.building.model;

public class Level extends BuildingComponent{
    private float area;
    private float volume;
    private float lightingpower;
    /**
     * Calculate area of level
     */
    public void calculateArea(){
        this.area = 0.0F;
    }

    /**
     * Calculating volume for level
     */
    public void calculateVolume(){
        this.volume = 0.0F;
    }

    /**
     * Calculating lighting power of level
     */
    public void calculateLightingpower(){
        this.lightingpower = 0.0F;
    }


}
