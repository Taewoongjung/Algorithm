package test.threadTest.daemonThread;

public class DaemonThread extends Thread {
    public void run() {
        try {
            System.out.println("started");
            Thread.sleep(Long.MAX_VALUE);
            System.out.println("ended");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
