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
//        level.addRoom(300,200,123);
//        level.addRoom(1000,1200,12);
//        level.addRoom(3400,100000,3000);
    }

    @Test
    public void testCalculateArea(){
        Room room1 = mock(Room.class, withSettings().useConstructor(300.0, 200.0, 123.0));
        Room room2 = mock(Room.class, withSettings().useConstructor(1000.0,1200.0,12.0));
        Room room3 = mock(Room.class, withSettings().useConstructor(3400.0,100000.0,3000.0));
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
        assertEquals(101400, level.calculateVolume());
    }

    @Test
    public void testSumLightPower(){
        assertEquals(3135,level.sumLightPower());
    }

    @Test
    public void testCalculateLightPower(){
        assertEquals(0.6670212765957447,level.calculateLightPower());
    }

    //tutaj trzeba dopełnić nwm jak to zrobić z mockami pzdr antek
    @Test
    public void testCalculateConsumption(){assertEquals(0,level.calculateConsumption());}




}