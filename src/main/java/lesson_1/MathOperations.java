package lesson_1;

/**
 * Created by silver_od on 4/27/16.
 */
public class MathOperations {
    public static double average(double[] numbers, int length) {
        double sum = sum(numbers);

        return sum / length;
    }

    public static double sum(double[] numbers) {
        double sum = 0;

        for (double number : numbers) {
            sum += number;
        }

        return sum;
    }
}
