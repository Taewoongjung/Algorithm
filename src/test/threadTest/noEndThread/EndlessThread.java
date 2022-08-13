package test.threadTest.noEndThread;

public class EndlessThread extends Thread {
    public int i;

    public EndlessThread(int i) {
        this.i = i;
    }
    public void run() {
        while (true) {
            try {
                System.out.println("Thread 1 = " + i++);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
