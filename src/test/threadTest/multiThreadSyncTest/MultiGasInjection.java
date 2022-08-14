package test.threadTest.multiThreadSyncTest;

public class MultiGasInjection extends Thread {
    private Car carInstance;
    private String stationName;
    private int gasAmount;
    private boolean flag;

    public MultiGasInjection(Car carInstance, String stationName, int gasAmount, boolean flag) {
        this.carInstance = carInstance;
        this.stationName = stationName;
        this.gasAmount = gasAmount;
        this.flag = flag;
    }

    public void run() {
        System.out.println("------------");
        System.out.println(this.stationName);
        System.out.println("before = " + carInstance);

        for (int i = 1; i <= gasAmount; i++) {
            if (flag) {
                carInstance.gasInjecting(1);
            } else {
                carInstance.gasMinus(1);
            }
        }

        System.out.println("after = " + carInstance);
        System.out.println("------------");
    }
}
