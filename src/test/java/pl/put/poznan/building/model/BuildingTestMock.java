package pl.put.poznan.building.model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;


public class BuildingTestMock {
    public static Building building;

    @BeforeAll
    public static void setUp(){
        ArrayList<Level> levels = new ArrayList<>();
        building = new Building(levels);
    }

    @Test
    public void testArea(){
        Room room1 = mock(Room.class, withSettings().useConstructor(10.0, 15.0, 10.0, 1, 5.0));
        Room room2 = mock(Room.class, withSettings().useConstructor(12.0, 17.0, 12.0, 2, 6.0));
        Room room3 = mock(Room.class, withSettings().useConstructor(14.0, 19.0, 15.0, 3, 7.0));
        when(room1.getArea()).thenReturn(10.0);
        when(room2.getArea()).thenReturn(12.0);
        when(room3.getArea()).thenReturn(14.0);
        ArrayList<Room> newRooms = new ArrayList<>();
        newRooms.add(room1);
        newRooms.add(room2);
        newRooms.add(room3);
        Level level1 = mock(Level.class, withSettings().useConstructor(newRooms));
        Level level2 = mock(Level.class, withSettings().useConstructor(newRooms));
        when(level2.calculateArea()).thenReturn(36.0);
        when(level1.calculateArea()).thenReturn(36.0);
        ArrayList<Level> newLevels = new ArrayList<>();
        newLevels.add(level1);
        newLevels.add(level2);
        building.setLevels(newLevels);
        assertEquals(72.0, building.calculateArea());
    }

    @Test
    public void testVolume(){
        Room room1 = mock(Room.class, withSettings().useConstructor(10.0, 15.0, 10.0, 1, 5.0));
        Room room2 = mock(Room.class, withSettings().useConstructor(12.0, 17.0, 12.0, 2, 6.0));
        Room room3 = mock(Room.class, withSettings().useConstructor(14.0, 19.0, 15.0, 3, 7.0));
        when(room1.getVolume()).thenReturn(15.0);
        when(room2.getVolume()).thenReturn(17.0);
        when(room3.getVolume()).thenReturn(19.0);
        ArrayList<Room> newRooms = new ArrayList<>();
        newRooms.add(room1);
        newRooms.add(room2);
        newRooms.add(room3);
        Level level1 = mock(Level.class, withSettings().useConstructor(newRooms));
        Level level2 = mock(Level.class, withSettings().useConstructor(newRooms));
        when(level2.calculateVolume()).thenReturn(51.0);
        when(level1.calculateVolume()).thenReturn(51.0);
        ArrayList<Level> newLevels = new ArrayList<>();
        newLevels.add(level1);
        newLevels.add(level2);
        building.setLevels(newLevels);
        assertEquals(102.0, building.calculateVolume());
    }

    @Test
    public void testSumLight(){
        Room room1 = mock(Room.class, withSettings().useConstructor(10.0, 15.0, 10.0, 1, 5.0));
        Room room2 = mock(Room.class, withSettings().useConstructor(12.0, 17.0, 12.0, 2, 6.0));
        Room room3 = mock(Room.class, withSettings().useConstructor(14.0, 19.0, 15.0, 3, 7.0));
        when(room1.getLightingpower()).thenReturn(10.0);
        when(room2.getLightingpower()).thenReturn(12.0);
        when(room3.getLightingpower()).thenReturn(15.0);
        ArrayList<Room> newRooms = new ArrayList<>();
        newRooms.add(room1);
        newRooms.add(room2);
        newRooms.add(room3);
        Level level1 = mock(Level.class, withSettings().useConstructor(newRooms));
        Level level2 = mock(Level.class, withSettings().useConstructor(newRooms));
        when(level2.sumLightPower()).thenReturn(37.0);
        when(level1.sumLightPower()).thenReturn(37.0);
        ArrayList<Level> newLevels = new ArrayList<>();
        newLevels.add(level1);
        newLevels.add(level2);
        building.setLevels(newLevels);
        assertEquals(74.0, building.sumLightPower());
    }

    @Test
    public void testCalculateLight(){
        Room room1 = mock(Room.class, withSettings().useConstructor(10.0, 15.0, 10.0, 1, 5.0));
        Room room2 = mock(Room.class, withSettings().useConstructor(12.0, 17.0, 12.0, 2, 6.0));
        Room room3 = mock(Room.class, withSettings().useConstructor(14.0, 19.0, 15.0, 3, 7.0));
        when(room1.getLightingpower()).thenReturn(10.0);
        when(room2.getLightingpower()).thenReturn(12.0);
        when(room3.getLightingpower()).thenReturn(15.0);
        when(room1.getArea()).thenReturn(10.0);
        when(room2.getArea()).thenReturn(12.0);
        when(room3.getArea()).thenReturn(14.0);

        ArrayList<Room> newRooms = new ArrayList<>();
        newRooms.add(room1);
        newRooms.add(room2);
        newRooms.add(room3);
        Level level1 = mock(Level.class, withSettings().useConstructor(newRooms));
        Level level2 = mock(Level.class, withSettings().useConstructor(newRooms));
        when(level2.sumLightPower()).thenReturn(37.0);
        when(level1.sumLightPower()).thenReturn(37.0);
        when(level1.calculateArea()).thenReturn(36.0);
        when(level2.calculateArea()).thenReturn(36.0);
        ArrayList<Level> newLevels = new ArrayList<>();
        newLevels.add(level1);
        newLevels.add(level2);
        building.setLevels(newLevels);
        assertEquals(1.0277777777777777, building.calculateLightPower());
    }

    @Test
    public void testCalculateConsumption(){
        Room room1 = mock(Room.class, withSettings().useConstructor(10.0, 15.0, 10.0, 1, 5.0));
        Room room2 = mock(Room.class, withSettings().useConstructor(12.0, 17.0, 12.0, 2, 6.0));
        Room room3 = mock(Room.class, withSettings().useConstructor(14.0, 19.0, 15.0, 3, 7.0));
        when(room1.getHeatingenergy()).thenReturn(5.0);
        when(room2.getHeatingenergy()).thenReturn(6.0);
        when(room3.getHeatingenergy()).thenReturn(7.0);
        when(room1.getVolume()).thenReturn(15.0);
        when(room2.getVolume()).thenReturn(17.0);
        when(room3.getVolume()).thenReturn(19.0);

        ArrayList<Room> newRooms = new ArrayList<>();
        newRooms.add(room1);
        newRooms.add(room2);
        newRooms.add(room3);
        Level level1 = mock(Level.class, withSettings().useConstructor(newRooms));
        Level level2 = mock(Level.class, withSettings().useConstructor(newRooms));
        when(level2.sumHeatingenergy()).thenReturn(18.0);
        when(level1.sumHeatingenergy()).thenReturn(18.0);
        when(level1.calculateVolume()).thenReturn(51.0);
        when(level2.calculateVolume()).thenReturn(51.0);
        ArrayList<Level> newLevels = new ArrayList<>();
        newLevels.add(level1);
        newLevels.add(level2);
        building.setLevels(newLevels);
        assertEquals(0.35294117647058826, building.calculateConsumption());
    }
}
