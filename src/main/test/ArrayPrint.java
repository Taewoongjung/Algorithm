package main.test;

import java.util.Arrays;

public class ArrayPrint {
    public static void main(String[] args) {
        ArrayPrint array = new ArrayPrint();
        array.printPrimitiveArray();

        int [][] twoDim = new int[5][2];
        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                twoDim[i][j] = (i + 1) + j;
            }
        }

        for(int i = 0; i < twoDim.length; i++) {
            System.out.println(Arrays.toString(twoDim[i]));
        }
//        twoDim[1]=new int[1];
//        System.out.println("@@@ = " + Arrays.toString(twoDim[1][1]));
//        System.out.println("@@@ = " + twoDim[1][1]);
    }
    public void printPrimitiveArray() {
        System.out.println("byteArray=" + new byte[0]);
        System.out.println("shortArray=" + new short[0]);
        System.out.println("intArray=" + new int[0]);
        System.out.println("longArray=" + new long[0]);
        System.out.println("floatArray=" + new float[0]);
        System.out.println("doubleArray=" + new double[0]);
        System.out.println("charArray=" + new char[0]);
        System.out.println("booleanArray=" + new boolean[0]);
    }
}