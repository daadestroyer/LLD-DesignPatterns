public class ExtraCheeze extends ToppingsDecorator{

    BasePizza basePizza;

    public ExtraCheeze(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    int cost() {
        return basePizza.cost()+10;
    }
}
