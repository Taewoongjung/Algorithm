package test.threadTest.noEndThread;

public class EndlessThreadSecond extends Thread {
    public int i;

    public EndlessThreadSecond(int i) {
        this.i = i;
    }

    public void run() {
        while (true) {
            try {
                System.out.println("Thread 2 = " + i++);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
