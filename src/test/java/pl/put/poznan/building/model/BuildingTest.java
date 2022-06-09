package pl.put.poznan.building.model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BuildingTest {
    private static Building building;
    private static Level level;
    private static Level levelTwo;

    @BeforeAll
    public static void setUp() {
        ArrayList<Room> rooms = new ArrayList<>();
        ArrayList<Room> roomsTwo = new ArrayList<>();
        level = new Level(rooms);
        levelTwo = new Level(roomsTwo);
        level.addRoom(124,154,198);
        level.addRoom(546,111,309);
        level.addRoom(987,3456,174);
        levelTwo.addRoom(189,143,2000);
        levelTwo.addRoom(145,500,345);
        levelTwo.addRoom(130,256,200);
        ArrayList<Level> levels = new ArrayList<>();
        building = new Building(levels);
        building.addLevel(level);
        building.addLevel(levelTwo);

    }

    @Test
    public void testCalculateArea(){
        assertEquals(2121, building.calculateArea());
    }

    @Test
    public void testCalculateVolume(){
        assertEquals(4620.0, building.calculateVolume());
    }

    @Test
    public void testSumLightPower(){
        assertEquals(3226.0,building.sumLightPower());
    }

    @Test
    public void testCalculateLightPower(){
        assertEquals(1.520980669495521,building.calculateLightPower());
    }

}