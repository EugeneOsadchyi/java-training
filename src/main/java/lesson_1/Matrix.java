package lesson_1;

class Matrix {
    public static int[][] transpone(int[][] array) {
        int[][] transponed_array = initialize_transponed_array(array);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                transponed_array[j][i] = array[i][j];
            }
        }

        return transponed_array;
    }

    public static void print_array(int[][] array) {
        for (int i = 0; i < array.length; i++) { // rows
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static int get_cols_count(int[][] array) {
        int max_cols = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].length > max_cols) {
                max_cols = array[i].length;
            }
        }

        return max_cols;
    }

    private static int[][] initialize_transponed_array(int[][] array) {
        int rows_count = array.length;
        int cols_count = Matrix.get_cols_count(array);

        return new int[cols_count][rows_count];
    }
}
