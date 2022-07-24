package test.practice.thread25;

import java.util.Date;

public class TimerThread extends Thread {
    private long sleepTime;

    public TimerThread(long sleepTime) {
        this.sleepTime = sleepTime;
    }

    public void run() {
        while (true) {
            System.out.println();
            printCurrentTime();
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printCurrentTime() {
        System.out.println(System.currentTimeMillis());
    }
}
