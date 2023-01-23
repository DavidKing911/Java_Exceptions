package Seminar_2;

import java.util.Scanner;

public class zadanie_4 {
    public static void main(String[] args) throws Exception {
        userInput();
    }

    public static void userInput() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ввод: ");
        String str = sc.nextLine();
        if (str.isEmpty()) {
            throw new RuntimeException("Ввод пустых строк невозможен");
        }
    }
}
