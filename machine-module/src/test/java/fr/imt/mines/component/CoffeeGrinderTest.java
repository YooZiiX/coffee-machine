package fr.imt.mines.component;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.*;

public class CoffeeGrinderTest {

    private CoffeeGrinder coffeeGrinder;
    private BeanTank beanTank;

    @BeforeEach
    void setUp() {
        coffeeGrinder = new CoffeeGrinder(1000);
        beanTank = mock(BeanTank.class);
    }

    @Test
    void testGrindCoffee() {
        try {
            double result = coffeeGrinder.grindCoffee(beanTank);
            assertEquals(1000, result);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
