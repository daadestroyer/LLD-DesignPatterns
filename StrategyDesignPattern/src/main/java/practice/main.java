package practice;

import example2.Operation;
import example2.OperationStrategy;

public class main {
    public static void main(String[] args) {
        Operation operation = new Operation(new AddOperation());
        System.out.println(operation.doOperation(10,20));

        Operation operation1 = new Operation(new MulOperation());
        System.out.println(operation1.doOperation(2,3));
    }
}
