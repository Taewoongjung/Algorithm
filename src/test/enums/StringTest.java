package test.enums;

public class StringTest {
    public static void main(String[] args) {

        String str = "Hello";

        byte[] buffer = str.getBytes();
        System.out.println(buffer);

        String str2 = new String(buffer);
        System.out.println(str2);
    }
}
