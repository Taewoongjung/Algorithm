package test.exception;

public class ExceptionSample {

    public static void main(String[] args) {
        ExceptionSample exceptionSample = new ExceptionSample();
        exceptionSample.arrayOutOfBoundsTryCatch();
    }
    public void arrayOutOfBoundsTryCatch() {
        try {
            System.out.println("this code should run");
            int[] intArray = new int[5];
            System.out.println(intArray[5]);
        } catch (Exception error) {
            System.out.println(error);
        }
        System.out.println("code default");
    }
}
