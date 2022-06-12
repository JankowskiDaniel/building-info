package pl.put.poznan.building.model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BuildingTest {
    private static Building building;
    private static Building buildingNegative;
    private static Level level;
    private static Level levelTwo;
    private static Level levelNegativ;

    @BeforeAll
    public static void setUp() {
        ArrayList<Room> rooms = new ArrayList<>();
        ArrayList<Room> roomsTwo = new ArrayList<>();
        ArrayList<Room> roomsNeg = new ArrayList<>();
        level = new Level(rooms);
        levelTwo = new Level(roomsTwo);
        levelNegativ = new Level(roomsNeg);

        level.addRoom(124,154,198, 1,100);
        level.addRoom(546,111,309, 2,200);
        level.addRoom(987,3456,174, 3,3);
        levelTwo.addRoom(189,143,2000, 1,420);
        levelTwo.addRoom(145,500,345,2,2148);
        levelTwo.addRoom(130,256,200,3,421);

        levelNegativ.addRoom(-100,-200,-400,40,-200);

        ArrayList<Level> levels = new ArrayList<>();
        ArrayList<Level> levelsTwo = new ArrayList<>();
        building = new Building(levels);
        building.addLevel(level);
        building.addLevel(levelTwo);
        buildingNegative = new Building(levelsTwo);
        buildingNegative.addLevel(levelNegativ);

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

    @Test
    public void testCalculateConsumption(){assertEquals(0.7125541125541126,building.calculateConsumption());}

    @Test
    public void testCalculateAreaException(){
        assertThrows(IllegalArgumentException.class,  () -> {
            buildingNegative.calculateArea();
        });
    }

    @Test
    public void testCalculateVolumeException(){
        assertThrows(IllegalArgumentException.class,  () -> {
            buildingNegative.calculateVolume();
        });
    }

    @Test
    public void testCalculateLightException(){
        assertThrows(IllegalArgumentException.class,  () -> {
            buildingNegative.calculateLightPower();
        });
    }

    @Test
    public void testCalculateConsumptionException(){
        assertThrows(IllegalArgumentException.class,  () -> {
            buildingNegative.calculateConsumption();
        });
    }

    @Test
    public void testCalculateSumLightPowerException(){
        assertThrows(IllegalArgumentException.class,  () -> {
            buildingNegative.sumLightPower();
        });
    }


}