package test.thread.thread2;

import test.thread.learnThread.RunnableSample;
import test.thread.learnThread.ThreadSample;

public class RunMultiThreads {
    public static void main(String[] args) {
        RunMultiThreads threads = new RunMultiThreads();
        threads.runMultiThread();
    }

    public void runMultiThread() {
        RunnableSample[] runnableSample = new RunnableSample[5];
        ThreadSample[] threadSample = new ThreadSample[5];
        for (int i = 0; i < 5; i++) {
            runnableSample[i] = new RunnableSample();
            threadSample[i] = new ThreadSample();

            new Thread(runnableSample[i]).start();
            threadSample[i].start();
        }
        System.out.println("runMultiThread() method is ended");
    }
}
