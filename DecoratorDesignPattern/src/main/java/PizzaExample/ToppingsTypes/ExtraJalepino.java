package PizzaExample.ToppingsTypes;

import PizzaExample.BasePizza.BasePizza;
import PizzaExample.ToppingsDecorator.ToppingsDecorator;

public class ExtraJalepino extends ToppingsDecorator {

    BasePizza basePizza;

    @Override
    public int cost() {
        return basePizza.cost() + 50;
    }
}
