package pl.put.poznan.building.model;

import java.util.ArrayList;

public class Level extends BuildingComponent{
    private float area;
    private float volume;
    private float lightingpower;

    private ArrayList<Room> rooms;

    public Level(String id){
        super(id);
        this.rooms=new ArrayList<>();
    }
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

    public void addRoom(Room room){this.rooms.add(room);}
    public void removeLevel(Room room){this.rooms.remove(room);}

    public float getArea(){return this.area;}
    public float getVolume(){return this.volume;}
    public float getLightingpower(){return this.lightingpower;}

    public void setArea(float area) {
        this.area = area;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public void setLightingpower(float lightingpower) {
        this.lightingpower = lightingpower;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }


}
