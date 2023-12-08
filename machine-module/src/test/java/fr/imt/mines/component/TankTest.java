package fr.imt.mines.component;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TankTest {

    private Tank tank;

    @BeforeEach
    void setUp() {
        tank = new Tank(50.0, 0.0, 100.0);
    }

    @Test
    void testConstructor() {
        assertEquals(0.0, tank.getMinVolume());
        assertEquals(100.0, tank.getMaxVolume());
        assertEquals(50.0, tank.getActualVolume());
    }

    @Test
    void testDecreaseVolumeInTank() {
        tank.decreaseVolumeInTank(25.0);
        assertEquals(25.0, tank.getActualVolume());
    }

    @Test
    void testIncreaseVolumeInTank() {
        tank.increaseVolumeInTank(25.0);
        assertEquals(75.0, tank.getActualVolume());
    }

    @Test
    void testDecreaseVolumeUnderTankVolume() {
        tank.decreaseVolumeInTank(75.0);
        assertEquals(tank.getMinVolume(), tank.getActualVolume());
    }

    @Test
    void testIncreaseVolumeOverTankVolume() {
        tank.increaseVolumeInTank(75.0);
        assertEquals(tank.getMaxVolume(), tank.getActualVolume());
    }
}
