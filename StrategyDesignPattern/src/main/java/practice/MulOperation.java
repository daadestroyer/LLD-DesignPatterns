package practice;

import example2.OperationStrategy;

public class MulOperation implements OperationStrategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
