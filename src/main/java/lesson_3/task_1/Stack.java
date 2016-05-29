package lesson_3.task_1;

public class Stack implements IntStack {
    private int[] stack;
    private int elementsInStack;

    public Stack(int size) {
        this.stack = new int[size];
        this.elementsInStack = 0;
    }

    public void push(int value) {
        checkLength();
        this.stack[elementsInStack++] = value;

        System.out.println("--- LOG: " + value + " pushed to Stack");
    }

    public int pop() throws RuntimeException {
        if (elementsInStack == 0) {
            System.out.println("Stack is empty.");
            return 0;
        }
        int value = this.stack[--elementsInStack];
        
        System.out.println("--- LOG: " + value + " popped from Stack");
        return value;
    }

    private void checkLength() {
        if (elementsInStack == this.stack.length) {
            System.out.println("--- LOG: Increasing Stack size by 1");

            int[] new_values = new int[this.stack.length + 1];

            for (int i = 0; i < this.stack.length; i++) {
                new_values[i] = this.stack[i];
            }

            this.stack = new_values;
        }
    }

    @Override
    public String toString() {
        String str = "--- INFO: Stack size: " + this.stack.length + " Elements in Stack: " + this.elementsInStack;
        str +=  " Stack: ";
        for (int element : this.stack) {
            str += element + " ";
        }

        return str;
    }
}
