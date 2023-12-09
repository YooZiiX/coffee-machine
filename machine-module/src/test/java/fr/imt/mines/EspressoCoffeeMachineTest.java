package fr.imt.mines;

import fr.imt.mines.cupboard.coffee.type.CoffeeType;
import fr.imt.mines.cupboard.container.CoffeeContainer;

import fr.imt.mines.cupboard.container.Cup;
import fr.imt.mines.cupboard.exception.CupNotEmptyException;
import fr.imt.mines.exception.CoffeeTypeCupDifferentOfCoffeeTypeTankException;
import fr.imt.mines.exception.LackOfWaterInTankException;
import fr.imt.mines.exception.MachineNotPluggedException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EspressoCoffeeMachineTest {

    private EspressoCoffeeMachine espressoCoffeeMachine;

    @BeforeEach
    void setUp() {
        espressoCoffeeMachine = new EspressoCoffeeMachine(10.0, 50.0, 5.0, 20.0, 2.0);
    }

    @Test
    void testMakeCoffeePlugged() {
        espressoCoffeeMachine.plugToElectricalPlug();
        espressoCoffeeMachine.addWaterInTank(10.0);
        espressoCoffeeMachine.addCoffeeInBeanTank(0.2, CoffeeType.ARABICA);
        CoffeeContainer result = null;
        try {
            result = espressoCoffeeMachine.makeACoffee(new Cup(0.2), CoffeeType.ARABICA);
        } catch (LackOfWaterInTankException | InterruptedException | MachineNotPluggedException | CupNotEmptyException |
                 CoffeeTypeCupDifferentOfCoffeeTypeTankException e) {
            throw new RuntimeException(e);
        }
        assertNotNull(result);
        assertFalse(result.isEmpty());
        assertEquals(15, espressoCoffeeMachine.getNbCoffeeMade());
    }
}
