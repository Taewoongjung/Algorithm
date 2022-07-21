package test.finalSample;



public class FinalSample {
    public static void main(String[] args) {
        FinalEx finalEx = new FinalEx();
        FinalSample finalSample = new FinalSample();

        finalEx.finalMethod();
        finalSample.traceIt();
    }

    public void traceIt() {
        System.out.println("FinalSample.traceIt");
    }
}
