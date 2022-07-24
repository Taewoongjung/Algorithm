package test.practice.thread25;

public class TimerMain {
    public static void main(String[] args) {
        TimerThread thread = new TimerThread(1000);
        thread.start();
    }
}
