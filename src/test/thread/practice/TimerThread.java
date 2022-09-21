package test.thread.practice;

import java.util.Date;

public class TimerThread extends Thread {
    public static int count;

    @Override
    public void run() {
        try {
            printCurrentTime();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void printCurrentTime() throws InterruptedException {
        int count = 0;
        while (count != 10) {
            Date date = new Date();
            System.out.println(date.toString() + System.currentTimeMillis());
            System.out.println(System.currentTimeMillis());
            sleep(1000);
            ++count;
        }
    }
}
