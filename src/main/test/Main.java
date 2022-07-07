package main.test;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
//        String s = bf.readLine(); //String
//        int i = Integer.parseInt(bf.readLine()); //Int
//
//        StringTokenizer st = new StringTokenizer(s); //StringTokenizer인자값에 입력 문자열 넣음
//        int a = Integer.parseInt(st.nextToken()); //첫번째 호출
//        int b = Integer.parseInt(st.nextToken()); //두번째 호출
//
//        String array[] = s.split(" "); //공백마다 데이터 끊어서 배열에 넣음
//
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기
//        String zz = "abcdefg";   //출력할 문자열
//        bw.write(zz+"\n");   //버퍼에 있는 값 전부 출력
//        bw.flush();   //남아있는 데이터를 모두 출력시킴
//        bw.close();   //스트림을 닫음
        int a = 1;
        int b = 2;
        int c = 3;

        a+= b+c;
        System.out.println(a);
    }
}
