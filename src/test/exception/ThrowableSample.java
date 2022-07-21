package test.exception;

public class ThrowableSample {
    public static void main(String[] args) throws Exception {
        ThrowableSample throwableSample = new ThrowableSample();
        throwableSample.throwException(13);
    }

    public void throwException(int number) throws Exception {
        if (number > 12) {
            throw new Exception("Number is over than 12");
        }
        System.out.println("Number is " + number);
    }
}
