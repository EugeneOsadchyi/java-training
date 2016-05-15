package lesson_2.task_1;

public class ArrayUtils {
    public static boolean isSizeEquals(double[][] array1, double[][] array2) {
        if (array1.length != array2.length) return false;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i].length != array2.length) return false;
        }

        return true;
    }
}
