package PizzaExample.ToppingsTypes;

import PizzaExample.BasePizza.BasePizza;


public class Mushroom extends BasePizza {
     BasePizza basePizza;
    @Override
    public int cost() {
        return basePizza.cost() + 110;
    }
}
