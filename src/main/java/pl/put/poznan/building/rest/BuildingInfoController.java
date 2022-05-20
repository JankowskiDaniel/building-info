package pl.put.poznan.building.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.building.logic.BuildingContainer;
import pl.put.poznan.building.model.Building;
import pl.put.poznan.building.model.Room;

import java.util.Arrays;


@RestController
public class BuildingInfoController {

    private static final Logger logger = LoggerFactory.getLogger(BuildingInfoController.class);

    @PostMapping("/building/area")
    public double area(@RequestBody Room room) {
        return room.getArea();
    }


    @GetMapping("/building/volume")
    public String get(@PathVariable String text,
                      @RequestParam(value = "transforms", defaultValue = "upper,escape") String[] transforms) {

        // log the parameters
        logger.debug(text);
        logger.debug(Arrays.toString(transforms));

        // perform the transformation, you should run your logic here, below is just a silly example
//        BuildingContainer transformer = new BuildingContainer(transforms);
//        return transformer.transform(text);

        return "Hi"+text;
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public String post(@PathVariable String text,
                       @RequestBody String[] transforms) {

        // log the parameters
        logger.debug(text);
        logger.debug(Arrays.toString(transforms));

        // perform the transformation, you should run your logic here, below is just a silly example
//        BuildingContainer transformer = new BuildingContainer(transforms);
//        return transformer.transform(text);
        return null;
    }


}

