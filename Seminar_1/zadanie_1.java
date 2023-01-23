import java.lang.RuntimeException;
import java.util.Arrays;

public class zadanie_1 {
    public static void main(String[] args) {
        int[] arr_1 = {3, 65, 2, 12, 5, 8};
        int[] arr_2 = {2, 6, 3, 1, 11, 4};
        System.out.println("Разность массивов -> " + Arrays.toString(newDiffArr(arr_1, arr_2)));
        System.out.println("Частное массивов -> " + Arrays.toString(newQuotientArr(arr_1, arr_2)));
    }

    public static int[] newDiffArr(int[] array_1, int[] array_2) {
        if (array_1.length != array_2.length) {
            throw new RuntimeException("Длины массивов не равны");
        }
        int[] newArray = new int[array_1.length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array_1[i] - array_2[i];
        }
        return newArray;
    }

    public static int[] newQuotientArr(int[] array_1, int[] array_2) {
        if (array_1.length != array_2.length) {
            throw new RuntimeException("Длины массивов не равны");
        }
        int[] newArray = new int[array_1.length];
        for (int i = 0; i < newArray.length; i++) {
            if (array_2[i] == 0) {
                throw new RuntimeException("Деление на ноль невозможно, измените число, которое находится на " + (i + 1) + " месте");
            }
            newArray[i] = array_1[i] / array_2[i];
        }
        return newArray;
    }
}