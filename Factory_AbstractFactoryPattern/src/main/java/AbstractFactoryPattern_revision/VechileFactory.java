package AbstractFactoryPattern_revision;

public class VechileFactory {
    public VechileSubFactory getFactory(String name){
        if(name.equalsIgnoreCase("ov")){
            return new OV_Factory();
        }
        else if(name.equalsIgnoreCase("lv")){
            return new LV_Factory();
        }
        else{
            return null;
        }
    }
}
