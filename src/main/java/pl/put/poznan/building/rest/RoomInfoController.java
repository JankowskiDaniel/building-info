package pl.put.poznan.building.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.building.model.Room;

/**
 * REST controller for room class
 */
@RestController
public class RoomInfoController {
    private static final Logger logger = LoggerFactory.getLogger(LevelInfoController.class);
    private static final ObjectMapper mapper = new ObjectMapper();

    @PostMapping("/room/area")
    public String area(@RequestBody Room room) throws JsonProcessingException {
        ObjectNode node = mapper.createObjectNode();
        node.put("Area", room.calculateArea());
        return mapper.writeValueAsString(node);
    }

    @PostMapping("/room/volume")
    public String volume(@RequestBody Room room) throws JsonProcessingException {
        ObjectNode node = mapper.createObjectNode();
        node.put("Volume", room.calculateVolume());
        return mapper.writeValueAsString(node);
    }

    @PostMapping("/room/lightPower")
    public String lightPower(@RequestBody Room room) throws JsonProcessingException {
        ObjectNode node = mapper.createObjectNode();
        node.put("Light power", room.calculateLightPower());
        return mapper.writeValueAsString(node);
    }

}
