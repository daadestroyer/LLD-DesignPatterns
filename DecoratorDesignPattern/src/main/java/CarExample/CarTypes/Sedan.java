package CarExample.CarTypes;

import CarExample.BaseCar.BaseCar;
import PizzaExample.BasePizza.BasePizza;

public class Sedan extends BaseCar {
    @Override
    public String cost() {
        return "12 Lakh";
    }
}
