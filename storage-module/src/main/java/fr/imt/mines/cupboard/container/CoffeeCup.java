package fr.imt.mines.cupboard.container;


import fr.imt.mines.cupboard.coffee.type.CoffeeType;
import fr.imt.mines.cupboard.container.CoffeeContainer;
import fr.imt.mines.cupboard.container.Container;

public class CoffeeCup extends CoffeeContainer {
    public CoffeeCup(double capacity, CoffeeType coffeeType) {
        super(capacity, coffeeType);
    }

    public CoffeeCup(Container container, CoffeeType coffeeType) {
        super(container, coffeeType);
    }
}