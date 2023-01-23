package Seminar_2;

import java.util.Scanner;

public class zadanie_1 {
    public static void main(String[] args) {
        System.out.println(getFloat());
    }

    public static float getFloat() {
        float num = 0f;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите дробное число: ");
            if (sc.hasNextFloat()) {
                num = sc.nextFloat();
                break;
            }
        }
        return num;
    }
}
