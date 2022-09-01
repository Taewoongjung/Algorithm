package test.ttestt;

public class JavacTest {
    public static void main(String[] args) {
        String strChan = String.valueOf(23);
        System.out.println(strChan);
        int btn = strChan.charAt(0) - '0';
        int btn2 = strChan.charAt(1) - '0';
        System.out.println(btn);
        System.out.println(btn2);

        int a = Math.min(11, 11);
        int b = Math.abs(100-111);
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
