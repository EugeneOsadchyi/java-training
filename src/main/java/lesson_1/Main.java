package lesson_1;

/**
 * Created by silver_od on 4/27/16.
 */

public class Main {
    public static void main(String[] args) {
    }

    public static void task_1() {
        double[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        double average_value = MathOperations.average(numbers, numbers.length);

        System.out.println(average_value);
    }

    public static void task_2() {
        int[][] array = { {5, 10, 3}, {4, 9}, {16}, {22, 33, 1, 6, 10} };
        Matrix.print_array(array);

        System.out.println();

        int[][] transponed_array = Matrix.transpone(array);
        Matrix.print_array(transponed_array);
    }


}
