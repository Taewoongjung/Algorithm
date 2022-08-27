package test.immutableObjectPractice.array;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        ArrayObject arrayObject = new ArrayObject(array);

        for (int num : arrayObject.getArray()) {
            System.out.println(num + " ");
        }

        System.out.println();
        array[0] = 999;

        for (int num : arrayObject.getArray()) {
            System.out.println(num + " ");
        }
    }
}
