package test.exception;

public class ThrowableSample {
    public static void main(String[] args) {
        try {
            ThrowableSample throwableSample = new ThrowableSample();
            throwableSample.throwException(13);
            System.out.println("aa");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void throwException(int number) throws Exception {
        if (number > 12) {
            throw new Exception("Number is over than 12");
        }
        System.out.println("Number is " + number);
    }
}
