package test.ttestt;

public class JavacTest {
    static int a = 0;
    public static void main(String[] args) {
        JavacTest main = new JavacTest();
        for (int day = 1; day <= 365; day++) {
            System.out.println(main.T_calculateAmount(day, 1000000));
        }
        System.out.println(a);
    }

    public double T_getInterestRate(int day) {
        if (day < 91) {
            a++;
            return 0.5;
        } else if (day < 181) {
            a++;
            return 1;
        } else if (day < 365) {
            a++;
            return 2;
        }
        return 5.6;
    }

    public double T_calculateAmount(int day, long amount) {
        double rate = T_getInterestRate(day);
        return rate * amount;
    }
}
