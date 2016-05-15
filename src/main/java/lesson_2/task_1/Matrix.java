package lesson_2.task_1;

import java.util.Arrays;

public class Matrix {
    private double[][] values;

    public Matrix(double[][] values) {
        this.values = values;
    }

    public void add(Matrix matrix) {
        if (!ArrayUtils.isSizeEquals(values, matrix.values)) {
            System.out.println("Can't add matrix");
            return;
        }

        for (int i = 0; i < this.values.length; i++) {
            for (int j = 0; j < this.values[i].length; j++) {
                this.values[i][j] += matrix.values[i][j]; // почему мы имеем доступ к private полю?!
            }
        }
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Matrix matrix = (Matrix) o;

        return Arrays.deepEquals(values, matrix.values);
    }

    public void multiply(double value) {
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length; j++) {
                values[i][j] *= value;
            }
        }
    }

    public double getMinValue() {
        double min = Double.MAX_VALUE;

        for (double[] row : values) {
            for (double val : row) {
                if (val < min) {
                    min = val;
                }
            }
        }

        return min;
    }

    public void print() {
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                System.out.print(values[i][j] + " ");
            }
            System.out.println();
        }
    }
}
