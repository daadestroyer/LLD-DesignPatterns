package example2.OperationTypes;

import example2.AddStrategy;
import example2.Operation;

public class AddOperation extends Operation {

    public AddOperation(){
        super(new AddStrategy());
    }

    public static void main(String[] args) {
        AddOperation addOperation = new AddOperation();
        System.out.println(addOperation.doOperation(10,20));
    }
}
