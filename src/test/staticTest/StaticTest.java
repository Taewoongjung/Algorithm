package test.staticTest;

public class StaticTest {
    public static void main(String[] args) {
        System.out.println(aa(10));
    }

    public static int aa(Integer a) {
        int result = a + 10;
        return result;
    }
}
