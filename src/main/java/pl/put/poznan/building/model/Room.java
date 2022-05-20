package pl.put.poznan.building.model;

public class Room implements BuildingSpace {
    private String name;
    private String address; //in building???

    private float area;
    private float volume;
    private float lightingpower;

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

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getName(){return this.name;}

    public String getAddress(){return this.address;}

}
