package pl.put.poznan.building.model;

public abstract class BuildingComponent implements BuildingSpace{

    private String id;
    public BuildingComponent(String id){
        this.id=id;
    }
    public void calculateArea(){};
    public void calculateVolume(){};
    public void calculateLightingpower(){};

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
