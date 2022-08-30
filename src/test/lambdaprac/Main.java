package test.lambdaprac;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.calculateAdd();
        main.calculateLambda();
        main.calculateSubtractLambda();
    }

    private void calculateAdd() {
        Calculate calculate = new Calculate() {
            @Override
            public int operation(int a, int b) {
                return a+b;
            }
        };
        System.out.println(calculate.operation(1,2));
    }

    private void calculateLambda() {
        Calculate calculate = (a, b) -> a + b;
        System.out.println(calculate.operation(1,2));
    }

    private void calculateSubtractLambda() {
        Calculate calculate = (a, b) -> a - b;
        System.out.println(calculate.operation(5, 2));

    }
}
