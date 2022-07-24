package test.thread.thread3;

public class RunEndlessThreads {
    public static void main(String[] args) {
        RunEndlessThreads threads = new RunEndlessThreads();
        threads.endless();
    }

    public void endless() {
        EndlessThread thread = new EndlessThread();
        thread.start();
    }
}
