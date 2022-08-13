package test.threadTest.runnableThreadTest;

public class RunThreads {
    public static void main(String[] args) {
        RunThreads runThreads = new RunThreads();
        runThreads.runBasic();
    }

    public void runBasic() {
        RunnableTest runnableTest = new RunnableTest();
        new Thread(runnableTest).start();

        ThreadSample threadSample = new ThreadSample();
        threadSample.start();
        System.out.println("RunThreads ended");
    }
}
