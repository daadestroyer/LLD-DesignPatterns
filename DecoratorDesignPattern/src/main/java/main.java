import PizzaExample.BasePizza.BasePizza;
import PizzaExample.PizzaTypes.CheezeBurst;
import PizzaExample.PizzaTypes.VegDelight;
import PizzaExample.ToppingsTypes.ExtraCheeze;
import PizzaExample.ToppingsTypes.ExtraJalepino;

public class main {
    public static void main(String[] args) {

        BasePizza basePizza = new ExtraJalepino(new ExtraCheeze(new VegDelight()));
        System.out.println(basePizza.cost());

    }
}
