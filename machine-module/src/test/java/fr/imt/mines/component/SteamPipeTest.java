package fr.imt.mines.component;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SteamPipeTest {

    private SteamPipe steamPipe;

    @BeforeEach
    void setUp() {
        steamPipe = new SteamPipe();
    }

    @Test
    void isOnTest() {
        assertFalse(steamPipe.isOn());
    }

    @Test
    void setOnTest() {
        steamPipe.setOn();
        assertTrue(steamPipe.isOn());
    }

    void setOffTest() {
        steamPipe.setOn();
        steamPipe.setOff();
        assertFalse(steamPipe.isOn());
    }
}
