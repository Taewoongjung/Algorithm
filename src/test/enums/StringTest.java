package test.enums;

import java.sql.SQLOutput;

public class StringTest extends ThrowClass{
    private static final ThrowClass throwClass = new ThrowClass();
    public static void main(String[] args){

        String str = "Hello";

        byte[] buffer = str.getBytes();
        System.out.println(buffer);

        String str2 = new String(buffer);
        System.out.println(str2);
        try {
            throwClass.throwIt();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
