package example2;

public class SubStrategy implements OperationStrategy{
    @Override
    public int doOperation(int num1, int num2) {
        return Math.abs(num1-num2);
    }
}
