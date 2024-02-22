package NullObjectDesignPattern;

public class VechileFactory {
    public Vechile getVechile(String vechileName){
        if(vechileName.equalsIgnoreCase("bike")){
            return new Bike();
        }
        else if(vechileName.equalsIgnoreCase("car")){
            return new Car();
        }
        else{
            return new NullObject();
        }
    }
}
