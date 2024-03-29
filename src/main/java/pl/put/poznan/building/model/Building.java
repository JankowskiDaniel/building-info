package pl.put.poznan.building.model;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

/**
 * Class for buildings
 */
public class Building extends BuildingComponent{

    @JsonCreator
    public Building(ArrayList<Level> levels){
        this.levels = levels;
        this.wrongrooms = new ArrayList<>();
        this.heatlimit = 0.0;

    }

    /**
     * Array with all levels, which are in this building
     */
    @JsonProperty("levels")
    private ArrayList<Level> levels;

    @JsonProperty("heatlimit")
    private double heatlimit;

    private ArrayList<String> wrongrooms;

    public void HeatingLimitRooms(){
        for (int i=0; i<levels.size(); i++){
            Level lvl=levels.get(i);
            for (int j=0; j<lvl.getRooms().size();j++){
                Room rm=lvl.getRooms().get(j);
                if (rm.calculateConsumption()>heatlimit){
                    this.wrongrooms.add(String.valueOf(rm.getId()));
                }
        }
    }
    }

    public String limitRoomsStr(){
        StringBuffer sb = new StringBuffer();
        for(int i=0; i< wrongrooms.size(); i++){
            sb.append(wrongrooms.get(i));
            sb.append(" ");
        }
        String str = sb.toString();
        return str;
    }
    /**
     * Calculating area of the building
     * @return area of the building
     */
    @JsonIgnore
    public double calculateArea(){
        double sum=0;
        for (int i=0; i<levels.size();i++){
            sum+=levels.get(i).calculateArea();
        }
        return sum;
    }

    /**
     * Calculating volume of the building
     * @return volume of the building
     */
    public double calculateVolume(){
        double sum=0;
        for (int i=0; i<levels.size();i++){
            sum+=levels.get(i).calculateVolume();
        }
        return sum;
    }

    /**
     * Calculating sum of light power of the building
     * @return sum of light power values
     */
    public double sumLightPower(){
        double sum=0.0;
        for(int i=0;i<levels.size(); i++){
            sum+=levels.get(i).sumLightPower();
        }
        return sum;
    }
    /**
     * Calculating sum of heating energy consumption of the building
     * @return sum of heating energy consumption
     */
    public double sumHeatingenergy(){
        double sum=0.0;
        for(int i=0;i<levels.size(); i++){
            sum+=levels.get(i).sumHeatingenergy();
        }
        return sum;
    }
    /**
     * Calculating average heating energy consumption of the building per m^3
     * @return sum of heating energy consumption
     */
    public double calculateConsumption(){
        return sumHeatingenergy()/calculateVolume();
    }
    /**
     * Calculating lighting power of building per m^2
     * @return lighting power
     */
    public double calculateLightPower(){
        return sumLightPower()/calculateArea();
    }

    public int calculateExtinguisher(){
        int sum = 0;
        for(int i=0; i< levels.size(); i++){
            sum+=levels.get(i).calculateExtinguisher();
        }
        return sum;
    }

    /**
     * Adds levels to the level list, used while testing
     *
     */
    @JsonIgnore
    public void addLevel(Level level){
        this.levels.add(level);
    }

    @JsonIgnore
    public void setLevels(ArrayList<Level> levels){this.levels = levels;}


    public int calculateDefibrillators(){
        int additional = levels.size()/10;
        return additional+1;
    }

    public int calculateAidkits(){
        int sum = 0;
        for(int i=0; i< levels.size(); i++){
            sum+=levels.get(i).calculateAidkits();
        }
        return sum;
    }
}
