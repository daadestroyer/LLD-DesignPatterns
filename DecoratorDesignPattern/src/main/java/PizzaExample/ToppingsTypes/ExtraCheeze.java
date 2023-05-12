package PizzaExample.ToppingsTypes;

import PizzaExample.BasePizza.BasePizza;

public class ExtraCheeze extends BasePizza {
    BasePizza basePizza;

    public ExtraCheeze(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost() + 100;
    }
}
