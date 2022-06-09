package pl.put.poznan.building.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.building.model.Level;

/**
 * Rest controller for level class
 */
@RestController
public class LevelInfoController {
    private static final Logger logger = LoggerFactory.getLogger(LevelInfoController.class);
    private static final ObjectMapper mapper = new ObjectMapper();

    @PostMapping("/level/area")
    public String area(@RequestBody Level level) throws JsonProcessingException {
        ObjectNode node = mapper.createObjectNode();
        node.put("Area", level.calculateArea());
        return mapper.writeValueAsString(node);
    }

    @PostMapping("/level/volume")
    public String volume(@RequestBody Level level) throws JsonProcessingException {
        ObjectNode node = mapper.createObjectNode();
        node.put("Volume", level.calculateVolume());
        return mapper.writeValueAsString(node);
    }

    @PostMapping("/level/lightPower")
    public String lightPower(@RequestBody Level level) throws JsonProcessingException {
        ObjectNode node = mapper.createObjectNode();
        node.put("Light power", level.calculateLightPower());
        return mapper.writeValueAsString(node);
    }

    @PostMapping("/level/heatconsumption")
    public String heatconsumption(@RequestBody Level level) throws JsonProcessingException {
        ObjectNode node = mapper.createObjectNode();
        node.put("Heat consumption", level.calculateConsumption());
        return mapper.writeValueAsString(node);
    }

    @PostMapping("/level/extinguisher")
    public String extinguisher(@RequestBody Level level) throws JsonProcessingException {
        ObjectNode node = mapper.createObjectNode();
        node.put("Number of fire extinguishers required", level.calculateExtinguisher());
        return mapper.writeValueAsString(node);
    }

    @PostMapping("/level/aidkits")
    public String aidkit(@RequestBody Level level) throws JsonProcessingException {
        ObjectNode node = mapper.createObjectNode();
        node.put("Number of first aid kits: ", level.calculateAidkits());
        return mapper.writeValueAsString(node);
    }

}
