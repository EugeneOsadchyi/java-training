package lesson_2.task_1;

import lesson_2.task_1.Matrix;

public class Main {

    private static double[][] mas = {{10, 20}};

    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(new double[][]{{5, 10, 3}, {3, 7, 4}, {5, 8, 2}});

        System.out.println("--- matrix1 init value");
        matrix1.print();

        Matrix matrix2 = new Matrix(mas);
        matrix1.add(matrix2); // can't add matrix2
        matrix1.print();

        matrix2 = new Matrix(new double[][]{{4, 9, 8}, {3, 6, 4}, {5, 8, 7}});
        if (matrix1.equals(matrix2)) {
            System.out.println("matrix1 equals matrix2");
        }

        System.out.println("--- matrix1 add matrix2");
        matrix1.add(matrix2);
        matrix1.print();

        System.out.println("--- matrix1 multiply by 0.5");
        matrix1.multiply(0.5);
        matrix1.print();

        System.out.println("--- matrix1 min value");
        System.out.println(matrix1.getMinValue());
    }
}
