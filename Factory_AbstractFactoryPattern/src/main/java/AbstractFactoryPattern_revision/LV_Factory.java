package AbstractFactoryPattern_revision;

public class LV_Factory implements  VechileSubFactory{
    public Vechile getVechile(String name){
        if(name.equalsIgnoreCase("bmw")){
            return new BMW_LV();
        }
        else if(name.equalsIgnoreCase("mercedez")){
            return new Mercedez_LV();
        }
        else{
            return null;
        }
    }
}
