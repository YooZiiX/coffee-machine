package fr.imt.mines.component;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.*;

public class WaterPumpTest {

    private WaterPump waterPump;
    private WaterTank waterTank;

    @BeforeEach
    void setUp() {
        waterPump = new WaterPump(1.0);
        waterTank = mock(WaterTank.class);
    }

    @Test
    void testPumpWater() {
        try {
            double result = waterPump.pumpWater(1.0 , waterTank);
            assertEquals(2000, result); // (1.0/ waterPump.getPumpingCapacity()) * 1000 * 2 = 2000
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
