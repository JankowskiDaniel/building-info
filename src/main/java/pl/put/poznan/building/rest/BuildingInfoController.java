package pl.put.poznan.building.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.building.model.Building;
import pl.put.poznan.building.model.Level;

/**
 * REST controller for building class
 */
@RestController
public class BuildingInfoController {

    private static final Logger logger = LoggerFactory.getLogger(LevelInfoController.class);
    private static final ObjectMapper mapper = new ObjectMapper();

    /**
     * Function which output area of the building to the endpoint
     * @param building
     * @return output string
     * @throws JsonProcessingException
     */
    @PostMapping("/building/area")
    public String area(@RequestBody Building building) throws JsonProcessingException {
        ObjectNode node = mapper.createObjectNode();
        node.put("Area", building.calculateArea());
        return mapper.writeValueAsString(node);
    }

    /**
     * Function which output volume of the building to the endpoint
     * @param building
     * @return
     * @throws JsonProcessingException
     */
    @PostMapping("/building/volume")
    public String volume(@RequestBody Building building) throws JsonProcessingException {
        ObjectNode node = mapper.createObjectNode();
        node.put("Volume", building.calculateVolume());
        return mapper.writeValueAsString(node);
    }

    /**
     * Function, which output lightpower of the building to the endpoint
     * @param building
     * @return
     * @throws JsonProcessingException
     */
    @PostMapping("/building/lightPower")
    public String lightPower(@RequestBody Building building) throws JsonProcessingException {
        ObjectNode node = mapper.createObjectNode();
        node.put("Light power", building.calculateLightPower());
        return mapper.writeValueAsString(node);
    }

    /**
     * Function which output heat consumption to the endpoint
     * @param building
     * @return
     * @throws JsonProcessingException
     */
    @PostMapping("/building/heatconsumption")
    public String heatconsumption(@RequestBody Building building) throws JsonProcessingException {
        ObjectNode node = mapper.createObjectNode();
        node.put("Heat consumption", building.calculateConsumption());
        return mapper.writeValueAsString(node);
    }

    @PostMapping("/building/extinguisher")
    public String extinguisher(@RequestBody Building building) throws JsonProcessingException {
        ObjectNode node = mapper.createObjectNode();
        node.put("Number of required fire extinguishers: ", building.calculateExtinguisher());
        return mapper.writeValueAsString(node);
    }

    @PostMapping("/building/aidkits")
    public String aidkit(@RequestBody Building building) throws JsonProcessingException {
        ObjectNode node = mapper.createObjectNode();
        node.put("Number of required first aid kits: ", building.calculateAidkits());
        return mapper.writeValueAsString(node);
    }

    @PostMapping("/building/defibrillators")
    public String defibrillators(@RequestBody Building building) throws JsonProcessingException {
        ObjectNode node = mapper.createObjectNode();
        node.put("Number of required defibrillators: ", building.calculateDefibrillators());
        return mapper.writeValueAsString(node);
    }

    @PostMapping("/building/heatlimit")
    public String heatlimit(@RequestBody Building building) throws JsonProcessingException {
        ObjectNode node = mapper.createObjectNode();
        building.HeatingLimitRooms();
        node.put("Number of required defibrillators: ", building.limitRoomsStr());
        return mapper.writeValueAsString(node);
    }


}

