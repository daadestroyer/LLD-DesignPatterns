package example2;

public class MulOperationStrategy implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1*num2;
    }
}
