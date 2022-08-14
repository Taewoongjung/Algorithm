package test.threadTest;

public class RunSupportThreads {
    public static void main(String[] args) {
        RunSupportThreads sample = new RunSupportThreads();
        sample.checkThreadState1();
    }

    public void checkThreadState1() {
        SleepThread thread = new SleepThread(2000);
        try {
            System.out.println("thread state= " + thread.getState());
            thread.start();
            System.out.println("thread state(after start)= " + thread.getState());

            thread.join(2001);
            thread.interrupt();
            System.out.println("thread(after 1 sec) state= " + thread.getState());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
