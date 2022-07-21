package test.multiCatch;

public class MultiCatch {
    public static void main(String[] args) {
        MultiCatch mc = new MultiCatch();
        mc.multiCatch();
    }
    public void multiCatch() {
        int[] intArray = new int[5];
        try {
            intArray = null;
            System.out.println(intArray[5]);
            System.out.println("this code should run");
        } catch (NullPointerException ne) {
            System.out.println("NullPointerException occurred");
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("ArrayIndexOutOfBoundsException occurred");
        } catch (Exception error) {
            System.out.println(error);
        }
        System.out.println("code default");
    }
}
