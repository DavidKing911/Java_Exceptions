package Seminar_2;

public class zadanie_2 {
    public static void main(String[] args) {
        int index = 8;
        int[] intArray = new int[index];
        int d = 0;
        if (d == 0) {
            throw new ArithmeticException("Деление на ноль невозможно");
        }
        if (index >= intArray.length) {
            throw new IndexOutOfBoundsException("Индекс вне пределов");

        }
        double catchedRes1 = intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
    }
}
