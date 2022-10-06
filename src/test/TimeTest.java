package test;

import java.time.LocalDate;

public class TimeTest {
    public static void main(String[] args) {
        if(LocalDate.of(2022,10,1).isBefore(LocalDate.now())) {
            System.out.println("@@");
        }
        System.out.println("??");
    }
}
