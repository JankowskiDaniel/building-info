package pl.put.poznan.building.logic;

import pl.put.poznan.building.model.BuildingComponent;
import pl.put.poznan.building.model.BuildingSpace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This is just an example to show that the logic should be outside the REST service.
 */
public class BuildingContainer extends BuildingComponent {

    protected List<BuildingSpace> children = new ArrayList<>();

    public BuildingContainer(BuildingSpace... components){
        super(null);
        add(components);
    }

    public void add(BuildingSpace component){
        this.children.add(component);
    }

    public void add(BuildingSpace... components){
        this.children.addAll(Arrays.asList(components));
    }

    public void remove(BuildingSpace component){
        this.children.remove(component);
    }

    public void remove(BuildingSpace... components){
        this.children.removeAll(Arrays.asList(components));
    }

    public void clear(){
        this.children.clear();
    }

    @Override
    public void calculateArea(){

    }

    @Override
    public void calculateVolume(){

    }

    @Override
    public void calculateLightingpower(){

    }
}
