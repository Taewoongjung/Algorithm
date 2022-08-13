package test.threadTest.noEndThread;

public class SampleMain {
    public static void main(String[] args) {
        EndlessThread endlessThread = new EndlessThread(0);
        endlessThread.start();

        EndlessThreadSecond endlessThreadSecond = new EndlessThreadSecond(0);
        endlessThreadSecond.start();
    }
}
