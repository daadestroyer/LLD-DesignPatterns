package practice;

import example2.OperationStrategy;

public class Operation {

    private OperationStrategy operationStrategy;

    public Operation(OperationStrategy operationStrategy) {
        this.operationStrategy = operationStrategy;
    }

    public int doOperation(int num1, int num2) {
        return this.operationStrategy.doOperation(num1, num2);
    }
}
