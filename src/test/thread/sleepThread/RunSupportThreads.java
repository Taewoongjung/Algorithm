package test.thread.sleepThread;

public class RunSupportThreads {
    public static void main(String[] args) {
        RunSupportThreads threads = new RunSupportThreads();
        threads.checkJoin();
    }

    public void checkThreadState() {
        SleepThread sleepThread = new SleepThread(2000);
        try {
            System.out.println("thread state = " + sleepThread.getState());
            sleepThread.start();
            System.out.println("thread state(after start) = " + sleepThread.getState());
            Thread.sleep(1000);
            System.out.println("thread state(after 1sec) = " + sleepThread.getState());
            sleepThread.join();
            sleepThread.interrupt();
            System.out.println("thread state(after join) = " + sleepThread.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void checkJoin() {
        SleepThread sleepThread = new SleepThread(2000);
        try {
            sleepThread.start();
            sleepThread.join(2001);
            sleepThread.interrupt();
            System.out.println("thread state(after join)=" + sleepThread.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
