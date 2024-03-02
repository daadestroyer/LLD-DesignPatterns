
class SingletonClass{
    // creating private constructor so that object creation attempts get failed
    private static SingletonClass singletonObj;
    private SingletonClass(){
        System.out.println("Singleton is instantiated.");
    }
    public static SingletonClass getSingletonObject(){
        if(singletonObj == null){
            singletonObj = new SingletonClass();
        }
        return singletonObj;
    }
    public String toString(){
        return "Singleton Object Created...";
    }
}
public class Main {
    public static void main(String[] args) {
        // not possible because of private constructor
        // SingletonClass singletonClass = new SingletonClass();

        // getting Singleton object by calling its static method
        SingletonClass singletonObject = SingletonClass.getSingletonObject();
        System.out.println(singletonObject);
    }
}

