package lesson_3.task_1;

import java.util.Arrays;

public class Stack implements IntStack {
    private int[] stack;
    private int elementsInStack;

    public Stack(int size) {
        this.stack = new int[size];
        this.elementsInStack = 0;
    }

    public void push(int value) {
        if (elementsInStack == this.stack.length) {
            System.out.println("--- INFO: doubled Stack size");
            this.stack = Arrays.copyOf(this.stack, this.stack.length * 2);
        }

        this.stack[elementsInStack++] = value;

        System.out.println("--- LOG: " + value + " pushed to Stack");
    }

    public int pop() {
        if (elementsInStack == 0) {
            System.out.println("Stack is empty.");
            return 0;
        }
        int value = this.stack[--elementsInStack];

        System.out.println("--- LOG: " + value + " popped from Stack");
        return value;
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
