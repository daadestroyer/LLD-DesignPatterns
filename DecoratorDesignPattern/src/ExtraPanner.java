public class ExtraPanner extends ToppingsDecorator{
    BasePizza basePizza;

    public ExtraPanner(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    int cost() {
        return basePizza.cost() + 20;
    }
}
