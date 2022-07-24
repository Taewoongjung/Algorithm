package test.thread.notifyThread;

public class RunObjectThreads {
    public static void main(String[] args) {
        RunObjectThreads sample = new RunObjectThreads();
        sample.checkThreadState3();
    }

    public void checkThreadState2() {
        Object monitor = new Object();
        StateThread thread = new StateThread(monitor);
        try {
            System.out.println("thread state = " + thread.getState()); // 1 NEW
            thread.start();
            System.out.println("thread state(after start) = " + thread.getState()); // 2 RUNNABLE

            Thread.sleep(100);
            System.out.println("thread state(after 0.1sec) = " + thread.getState()); // 3 WAITING

            synchronized (monitor) {
                monitor.notify();
            }
            Thread.sleep(100);
            System.out.println("thread state(after notify) = " + thread.getState()); // 5 RUNNABLE

            thread.join();
            System.out.println("thread state(after join) = " + thread.getState()); // 6 TERMINATED
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void checkThreadState3() {
        Object monitor = new Object();
        StateThread thread = new StateThread(monitor);
        StateThread thread2 = new StateThread(monitor);
        try {
            System.out.println("thread state = " + thread.getState()); // 1 NEW
            thread.start();
            thread2.start();
            System.out.println("thread state(after start) = " + thread.getState()); // 2 RUNNABLE

            Thread.sleep(100);
            System.out.println("thread state(after 0.1sec) = " + thread.getState()); // 3 WAITING

            synchronized (monitor) {
                monitor.notifyAll();
            }
            System.out.println("thread state(before notify) = " + thread.getState()); // 5 TIMED_WAITING
            Thread.sleep(100);
            System.out.println("thread state(after notify) = " + thread.getState()); // 5 TIMED_WAITING

            thread.join();
            System.out.println("thread state(after join) = " + thread.getState()); // 6

            thread2.join();
            System.out.println("thread2 state(after join) = " + thread.getState()); // 7
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
