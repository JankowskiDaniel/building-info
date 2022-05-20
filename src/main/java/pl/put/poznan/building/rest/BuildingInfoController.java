package pl.put.poznan.building.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.building.model.Building;


@RestController
public class BuildingInfoController {

    private static final Logger logger = LoggerFactory.getLogger(BuildingInfoController.class);

    @PostMapping("/building/area")
    public double area(@RequestBody Building building) {
        return building.calculateArea();
    }

    @PostMapping("/building/volume")
    public double volume(@RequestBody Building building){
        return building.calculateVolume();
    }

    @PostMapping("/building/lightpower")
    public double power(@RequestBody Building building){
        return building.calculateLightPower();
    }



}

