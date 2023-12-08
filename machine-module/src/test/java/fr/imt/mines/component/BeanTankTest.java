package fr.imt.mines.component;

import fr.imt.mines.cupboard.coffee.type.CoffeeType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BeanTankTest {

    private BeanTank beanTank;

    @BeforeEach
    void setUp() {
        beanTank = new BeanTank(50.0, 0.0, 100.0, CoffeeType.ARABICA);
    }

    @Test
    void testConstructor() {
        assertEquals(0.0, beanTank.getMinVolume());
        assertEquals(100.0, beanTank.getMaxVolume());
        assertEquals(50.0, beanTank.getActualVolume());
    }

    @Test
    void testDecreaseVolumeInTank() {
        beanTank.decreaseVolumeInTank(25.0);
        assertEquals(25.0, beanTank.getActualVolume());
    }

    @Test
    void testIncreaseVolumeInTank() {
        beanTank.increaseVolumeInTank(25.0);
        assertEquals(75.0, beanTank.getActualVolume());
    }

    @Test
    void testDecreaseVolumeUnderTankVolume() {
        beanTank.decreaseVolumeInTank(75.0);
        assertEquals(beanTank.getMinVolume(), beanTank.getActualVolume());
    }

    @Test
    void testIncreaseVolumeOverTankVolume() {
        beanTank.increaseVolumeInTank(75.0);
        assertEquals(beanTank.getMaxVolume(), beanTank.getActualVolume());
    }

    @Test
    void testGetBeanCoffeeType() {
        assertEquals(CoffeeType.ARABICA, beanTank.getBeanCoffeeType());
    }

    @Test
    void testSetBeanCoffeeType() {
        beanTank.setBeanCoffeeType(CoffeeType.ROBUSTA);
        assertEquals(CoffeeType.ROBUSTA, beanTank.getBeanCoffeeType());
    }
}
