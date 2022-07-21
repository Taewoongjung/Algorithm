package test.finallySample;

public class FinallySample {
    public static void main(String[] args) {
        FinallySample finallySample = new FinallySample();
        finallySample.finallySample();
    }
    public void finallySample() {
        int[] intArray = new int[5];
        try {
            System.out.println(intArray[5]);
        } catch (Exception error) {
            System.out.println(intArray.length);
        } finally {
            System.out.println("Here is finally");
        }
        System.out.println("this code must run");
    }
}
