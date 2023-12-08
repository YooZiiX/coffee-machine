package fr.imt.mines.component;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WaterTankTest {

    private WaterTank waterTank;

    @BeforeEach
    void setUp() {
        waterTank = new WaterTank(50.0, 0.0, 100.0);
    }

    @Test
    void testConstructor() {
        assertEquals(0.0, waterTank.getMinVolume());
        assertEquals(100.0, waterTank.getMaxVolume());
        assertEquals(50.0, waterTank.getActualVolume());
    }

    @Test
    void testDecreaseVolumeInWaterTank() {
        waterTank.decreaseVolumeInTank(25.0);
        assertEquals(25.0, waterTank.getActualVolume());
    }

    @Test
    void testIncreaseVolumeInWaterTank() {
        waterTank.increaseVolumeInTank(25.0);
        assertEquals(25.0, waterTank.getActualVolume());
    }

    @Test
    void testDecreaseVolumeUnderTankVolume() {
        waterTank.decreaseVolumeInTank(75.0);
        assertEquals(waterTank.getMinVolume(), waterTank.getActualVolume());
    }

    @Test
    void testIncreaseVolumeOverTankVolume() {
        waterTank.increaseVolumeInTank(75.0);
        assertEquals(waterTank.getMaxVolume(), waterTank.getActualVolume());
    }

}
