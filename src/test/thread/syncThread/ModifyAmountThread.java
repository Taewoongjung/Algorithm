package test.thread.syncThread;

public class ModifyAmountThread extends Thread {
    private CommonCalculate calc;
    private boolean flag;

    public ModifyAmountThread(CommonCalculate calc, boolean flag) {
        this.calc = calc;
        this.flag = flag;
    }

    public void run() {
        for (int i = 0; i < 10000; i++) {
            if (flag) {
                calc.plus(1);
                calc.addInterest(2);
            } else {
                calc.minus(1);
            }
        }
    }
}
