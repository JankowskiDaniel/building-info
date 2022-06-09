package pl.put.poznan.building.model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LevelTest {
    private static Level level;

    @BeforeAll
    public static void setUp() {
        ArrayList<Room> rooms = new ArrayList<>();
//        level = new Level(rooms);
//        level.addRoom(300,200,123);
//        level.addRoom(1000,1200,12);
//        level.addRoom(3400,100000,3000);
    }

    @Test
    public void testCalculateArea(){
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




}