package test.threadTest.multiThreadSyncTest;

public class RunThreadMain {
    public static void main(String[] args) throws InterruptedException {
        Car car = new Car("defaultName", "SUV",0);

        Thread thread1 = new MultiGasInjection(car, "FirstStation",1000000, true);
        thread1.start();
//        Thread.sleep(100);
        Thread thread2 = new MultiGasInjection(car, "SecondStation",6000, true);
        thread2.start();

        Thread thread3 = new MultiGasInjection(car, "SecondStation",60, false);
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            System.out.println("All after = " + car);
        } catch (Exception E) {
            E.printStackTrace();
        }

    }
}
