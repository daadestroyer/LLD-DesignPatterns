package example2;

public class Operation {

    private OperationStrategy operationStrategy;

    public Operation(OperationStrategy operationStrategy){
        this.operationStrategy = operationStrategy;
    }
    public int doOperation(int num1 , int num2){
        return operationStrategy.doOperation(num1,num2);
    }


}
