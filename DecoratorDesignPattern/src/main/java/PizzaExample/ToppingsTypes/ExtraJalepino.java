package PizzaExample.ToppingsTypes;

import PizzaExample.BasePizza.BasePizza;


public class ExtraJalepino extends BasePizza {

    BasePizza basePizza;
    public ExtraJalepino(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost() + 50;
    }
}
