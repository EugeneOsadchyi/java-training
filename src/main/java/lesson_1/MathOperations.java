package lesson_1;

class MathOperations {

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
