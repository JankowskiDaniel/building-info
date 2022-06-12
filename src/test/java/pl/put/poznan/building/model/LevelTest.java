package pl.put.poznan.building.model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LevelTest {
    private static Level level;

    @BeforeAll
    public static void setUp() {
        ArrayList<Room> rooms = new ArrayList<>();
        level = new Level(rooms);
        level.addRoom(10,20,400,500,200);
        level.addRoom(200,34,54,26,45);
    }

    @Test
    public void testCalculateArea(){
        Room room1 = mock(Room.class, withSettings().useConstructor(300.0, 200.0, 123.0, 1, 10.0));
        Room room2 = mock(Room.class, withSettings().useConstructor(1000.0,1200.0,12.0, 2, 20.0));
        Room room3 = mock(Room.class, withSettings().useConstructor(3400.0,100000.0,3000.0, 3, 30.0));
        when(room1.getArea()).thenReturn(300.0);
        when(room2.getArea()).thenReturn(1000.0);
        when(room3.getArea()).thenReturn(3400.0);
        ArrayList<Room> newRooms = new ArrayList<>();
        newRooms.add(room1);
        newRooms.add(room2);
        newRooms.add(room3);
        level.setRooms(newRooms);
        assertEquals(4700, level.calculateArea());
    }

    @Test
    public void testCalculateVolume(){
        Room room1 = mock(Room.class, withSettings().useConstructor(300.0, 200.0, 123.0, 1, 10.0));
        Room room2 = mock(Room.class, withSettings().useConstructor(1000.0,1200.0,12.0, 2, 20.0));
        Room room3 = mock(Room.class, withSettings().useConstructor(3400.0,100000.0,3000.0, 3, 30.0));
        when(room1.getVolume()).thenReturn(200.0);
        when(room2.getVolume()).thenReturn(1200.0);
        when(room3.getVolume()).thenReturn(100000.0);
        ArrayList<Room> newRooms = new ArrayList<>();
        newRooms.add(room1);
        newRooms.add(room2);
        newRooms.add(room3);
        level.setRooms(newRooms);
        assertEquals(101400, level.calculateVolume());
    }

    @Test
    public void testSumLightPower(){
        Room room1 = mock(Room.class, withSettings().useConstructor(300.0, 200.0, 123.0, 1, 10.0));
        Room room2 = mock(Room.class, withSettings().useConstructor(1000.0,1200.0,12.0, 2, 20.0));
        Room room3 = mock(Room.class, withSettings().useConstructor(3400.0,100000.0,3000.0, 3, 30.0));
        when(room1.getLightingpower()).thenReturn(123.0);
        when(room2.getLightingpower()).thenReturn(12.0);
        when(room3.getLightingpower()).thenReturn(3000.0);
        ArrayList<Room> newRooms = new ArrayList<>();
        newRooms.add(room1);
        newRooms.add(room2);
        newRooms.add(room3);
        level.setRooms(newRooms);
        assertEquals(3135,level.sumLightPower());
    }

    @Test
    public void testCalculateLightPower(){
        Room room1 = mock(Room.class, withSettings().useConstructor(300.0, 200.0, 123.0, 1, 10.0));
        Room room2 = mock(Room.class, withSettings().useConstructor(1000.0,1200.0,12.0, 2, 20.0));
        Room room3 = mock(Room.class, withSettings().useConstructor(3400.0,100000.0,3000.0, 3, 30.0));
        when(room1.getLightingpower()).thenReturn(123.0);
        when(room2.getLightingpower()).thenReturn(12.0);
        when(room3.getLightingpower()).thenReturn(3000.0);
        when(room1.getArea()).thenReturn(300.0);
        when(room2.getArea()).thenReturn(1000.0);
        when(room3.getArea()).thenReturn(3400.0);
        ArrayList<Room> newRooms = new ArrayList<>();
        newRooms.add(room1);
        newRooms.add(room2);
        newRooms.add(room3);
        level.setRooms(newRooms);
        assertEquals(0.6670212765957447,level.calculateLightPower());
    }
    @Test
    public void testCalculateConsumption(){
        Room room1 = mock(Room.class, withSettings().useConstructor(300.0, 200.0, 123.0, 1, 1340.0));
        Room room2 = mock(Room.class, withSettings().useConstructor(1000.0,1200.0,12.0, 2, 2000.0));
        Room room3 = mock(Room.class, withSettings().useConstructor(3400.0,100000.0,3000.0, 3, 300000.0));
        when(room1.getVolume()).thenReturn(200.0);
        when(room2.getVolume()).thenReturn(1200.0);
        when(room3.getVolume()).thenReturn(100000.0);
        when(room1.getHeatingenergy()).thenReturn(1340.0);
        when(room2.getHeatingenergy()).thenReturn(2000.0);
        when(room3.getHeatingenergy()).thenReturn(300000.0);
        ArrayList<Room> newRooms = new ArrayList<>();
        newRooms.add(room1);
        newRooms.add(room2);
        newRooms.add(room3);
        level.setRooms(newRooms);
        assertEquals(2.9915187376725838264299802761341, level.calculateConsumption());
    }
    @Test
    public void testAidkits(){
        assertEquals(2, level.calculateAidkits());
    }

    @Test
    public void testExtinguishers(){
        assertEquals(1, level.calculateExtinguisher());
    }

    @Test
    public void testCalculateAreaException(){
        level.addRoom(-2,154,198, 2,100);
        assertThrows(IllegalArgumentException.class,  () -> {
            level.calculateArea();
        });

    }

    @Test
    public void testCalculateVolumeException(){
        level.addRoom(200,-100,198, 5,100);
        assertThrows(IllegalArgumentException.class,  () -> {
            level.calculateVolume();
        });

    }

    @Test
    public void testCalculateSumException(){
        level.addRoom(-2,154,-200, 6,100);
        assertThrows(IllegalArgumentException.class,  () -> {
            level.sumLightPower();
        });

    }

    @Test
    public void testCalculateLightException(){
        level.addRoom(-2,154,-200, 8,100);
        assertThrows(IllegalArgumentException.class,  () -> {
            level.calculateLightPower();
        });

    }

    @Test
    public void testCalculateConsumptionException(){
        level.addRoom(-2,154,-200, 10,-2);
        assertThrows(IllegalArgumentException.class,  () -> {
            level.calculateConsumption();
        });

    }



}