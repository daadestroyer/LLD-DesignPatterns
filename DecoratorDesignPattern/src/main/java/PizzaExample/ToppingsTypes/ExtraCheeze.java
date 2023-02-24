package PizzaExample.ToppingsTypes;

import PizzaExample.BasePizza.BasePizza;
import PizzaExample.ToppingsDecorator.ToppingsDecorator;

public class ExtraCheeze extends ToppingsDecorator {
    BasePizza basePizza;

    public ExtraCheeze(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost() + 100;
    }
}
