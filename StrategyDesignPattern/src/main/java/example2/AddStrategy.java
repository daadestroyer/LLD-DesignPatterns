package example2;

import java.util.Observable;

public class AddStrategy implements OperationStrategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;

    }
}
