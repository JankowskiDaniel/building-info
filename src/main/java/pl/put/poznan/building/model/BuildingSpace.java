package pl.put.poznan.building.model;

/**
 * Interface, which holds common methods of building components
 */
public interface BuildingSpace {

    public double calculateArea();
    public double calculateVolume();
    public double calculateLightPower();
    public double sumLightPower();
}
