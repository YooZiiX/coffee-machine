package fr.imt.mines.cupboard.container;

import fr.imt.mines.cupboard.coffee.type.CoffeeType;

public class CoffeeMug extends CoffeeContainer{

    public CoffeeMug(double capacity, CoffeeType coffeeType) {
        super(capacity, coffeeType);
    }

    public CoffeeMug(Mug mug, CoffeeType coffeeType) {
        super(mug, coffeeType);
    }
}
