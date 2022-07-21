package test.exception;

public class ExceptionVariable {
    public static void main(String[] args) {
        ExceptionVariable exceptionVariable = new ExceptionVariable();
        exceptionVariable.checkVariable();
    }
    public void checkVariable() {
        int[] intArray = null;
        try {
            intArray = new int[5];
            System.out.println(intArray[5]);
        } catch(Exception error) {
            System.err.println(intArray.length);
        }
        System.out.println("this code must run");
    }
}
