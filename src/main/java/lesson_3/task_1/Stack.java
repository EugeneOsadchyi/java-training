package lesson_3.task_1;

public class Stack {
    private double[] values;
    private int elementsInStack;

    public Stack(int length) {
        this.values = new double[length];
        this.elementsInStack = 0;
    }

    public void push(double value) {
        checkLength();
        this.values[elementsInStack++] = value;

        System.out.println("--- LOG: " + value + " pushed to lesson_3.task_1.Stack");
    }

    public double pop() throws RuntimeException {
        if (elementsInStack == 0) {
            throw new RuntimeException("--- ERROR: lesson_3.task_1.Stack is empty. Have no elements to pop.");
        }

        double value = this.values[--elementsInStack];
        System.out.println("--- LOG: " + value + " popped from lesson_3.task_1.Stack");

        return value;
    }

    private void checkLength() {
        if (elementsInStack == this.values.length) {
            System.out.println("--- LOG: Increasing lesson_3.task_1.Stack size by 1");

            double[] new_values = new double[this.values.length + 1];

            for (int i = 0; i < this.values.length; i++) {
                new_values[i] = this.values[i];
            }

            this.values = new_values;
        }
    }

    @Override
    public String toString() {
        String str = "--- INFO: lesson_3.task_1.Stack size: " + this.values.length + " Elements in lesson_3.task_1.Stack: " + this.elementsInStack;
        str +=  " lesson_3.task_1.Stack: ";
        for (double element : this.values) {
            str += element + " ";
        }

        return str;
    }
}
