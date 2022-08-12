package test.stringTest;

public class StringTest {
    public static void main(String[] args) {
        String str = "lxxjn0";
        String str2 = "lxxjn0";
        String str3 = new String("lxxjn0");
        String str4 = new String("lxxjn0");
        String str5 = new String("lxxjn1");

        System.out.println(str.equals(str2));
        System.out.println(str == str2);

        System.out.println(str2.equals(str4));
        System.out.println(str3.equals(str5));

        System.out.println(str2 == str3);
        System.out.println(str3 == str4);

        str += str2;
        System.out.println("fi = "+str);
        System.out.println(str == str2);

    }
}
