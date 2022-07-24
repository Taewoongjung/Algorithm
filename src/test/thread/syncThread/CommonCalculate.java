package test.thread.syncThread;

public class CommonCalculate {
    private int amount;
    private int interest;

    public CommonCalculate() {
        amount = 0;
    }

    Object lock = new Object();
    Object lock2 = new Object();
    public synchronized void plus(int value) {
        synchronized (lock) {
            amount += value;
        }
    }

    public synchronized void addInterest(int value) {
        synchronized (lock2) {
            interest += value;
        }
    }

    public synchronized void minus(int value) {
        synchronized (lock) {
            amount -= value;
        }
    }

    public int getAmount() {
        return amount;
    }

    public int getInterest() {
        return interest;
    }
}
