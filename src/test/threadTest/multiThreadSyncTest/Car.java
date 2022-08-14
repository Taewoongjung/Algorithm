package test.threadTest.multiThreadSyncTest;

public class Car {
    private String name;
    private String carType;
    private int gasAmount;

    public Car(String name, String carType, int gasAmount) {
        this.name = name;
        this.carType = carType;
        this.gasAmount = gasAmount;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", carType='" + carType + '\'' +
                ", gasAmount=" + gasAmount +
                '}';
    }

    public int getGasAmount() {
        return gasAmount;
    }

    public void setGasAmount(int gasAmount) {
        this.gasAmount = gasAmount;
    }

    public String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public synchronized void gasInjecting(int gasAmount) {
        this.gasAmount += gasAmount;
    }

    public synchronized void gasMinus(int gasAmount) {
        this.gasAmount -= gasAmount;
    }

}
