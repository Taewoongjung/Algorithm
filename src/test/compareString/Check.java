package test.compareString;

public class Check {
    public static void main(String[] args) {
        Check check = new Check();
        check.checkCompare();
    }

    public void checkCompare() {
        String text = "Check value";
        String text2 = "Check value";

        if (text == text2) {
            System.out.println("text == text2 result is same.");
        } else {
            System.out.println("text == text2 result is different");
        }
        if (text.equals("Check value")) {
            System.out.println("text.equals(text2) result is same.");
        }
    }
}
