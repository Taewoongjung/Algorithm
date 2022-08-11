package test.javaLangTest;

public class PrintObjNull {
    public static void main(String[] args) {
        PrintObjNull printObjNull = new PrintObjNull();
        printObjNull.printNull();
    }

    public void printNull() {
        Object obj = 1;
        System.out.println(obj);
        Object temp = String.valueOf(obj);
        System.out.println(temp.getClass().getSimpleName());

        StringBuilder sb = new StringBuilder();
        sb.append(obj.getClass());
        System.out.println("sb = " + sb);
        System.out.println(obj + " is object's value");
    }
}
