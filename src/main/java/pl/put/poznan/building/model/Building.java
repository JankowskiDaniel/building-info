package pl.put.poznan.building.model;


import java.util.ArrayList;

public class Building {

    private String name;
    private String address;

    private float area;
    private float volume;
    private float lightingpower;

    //list with levels in building
    private ArrayList<Level> levels;

    Building(String name, String address){
        this.name = name;
        this.address = address;
        this.levels = new ArrayList<>();
    }

    //wszystkie trzy ponizsze funkcje beda zadeklarowane w interfejsie i są one wspólne dla pozostałych modeli

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

    public void addLevel(Level level){this.levels.add(level);}
    public void removeLevel(Level level){this.levels.remove(level);}

    public void setName(String name){this.name = name;}
    public void setAddress(String address){this.address = address;}

    public float getArea(){return this.area;}
    public float getVolume(){return this.volume;}
    public float getLightingpower(){return this.lightingpower;}

    public ArrayList getLevels(){return this.levels;}
    public String getName(){return this.name;}
    public String getAddress(){return this.address;}

}
