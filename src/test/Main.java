package test;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("main class started");
//        Calculator calc = new Calculator();
//        int a = 10;
//        int b = 5;
//        int result1 = calc.add(a, b);
//        int result2 = calc.substract(a, b);
//        int result3 = calc.multiply(a, b);
//        int result4 = calc.divide(a, b);
//
//        System.out.println(result1);
//        System.out.println(result2);
//        System.out.println(result3);
//        System.out.println(result4);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String strChan = String.valueOf(0);
        int btn = strChan.charAt(1) - '0';
        System.out.println("fir = " + strChan);
        System.out.println("sec = " + btn);
    }
}
