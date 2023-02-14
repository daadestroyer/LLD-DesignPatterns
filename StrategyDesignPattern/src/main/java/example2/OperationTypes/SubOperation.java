package example2.OperationTypes;

import example2.Operation;
import example2.SubStrategy;

public class SubOperation extends Operation {
    public SubOperation(){
        super(new SubStrategy());
    }

    public static void main(String[] args) {
        SubOperation subOperation = new SubOperation();
        System.out.println(subOperation.doOperation(20,30));
    }
}
