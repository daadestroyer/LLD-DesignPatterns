package AbstractFactoryPattern_revision;

public class OV_Factory implements VechileSubFactory {
    public Vechile getVechile(String name){
        if(name.equalsIgnoreCase("alto")){
            return new Alto_OV();
        }
        else if(name.equalsIgnoreCase("swift")){
            return new Swift_OV();
        }
        else{
            return null;
        }
    }
}
