package example1;



public class Vechile {
    Strategy strategy;
    public Vechile(Strategy strategy){
        this.strategy = strategy;
    }
    public void drive(){
        strategy.drive();
    }
}
