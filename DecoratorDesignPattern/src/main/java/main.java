import PizzaExample.PizzaTypes.CheezeBurst;
import PizzaExample.ToppingsTypes.ExtraCheeze;

public class main {
    public static void main(String[] args) {
        CheezeBurst cheezeBurst = new CheezeBurst();

        ExtraCheeze extraCheeze = new ExtraCheeze(cheezeBurst);
        System.out.println(extraCheeze.cost());
    }
}
