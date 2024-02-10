package example2;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new AddOperationStrategy());
        System.out.println(context.doOperation(10,20));

        Context context1 = new Context(new SubOperationStrategy());
        System.out.println(context1.doOperation(20,10));

        Context context2 = new Context(new MulOperationStrategy());
        System.out.println(context2.doOperation(30,2));
    }
}
