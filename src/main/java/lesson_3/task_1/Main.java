package lesson_3.task_1;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        System.out.println("\n--- Print stack");
        System.out.println(stack);

        System.out.println("\n--- Insert element to Stack");
        stack.push(5);
        System.out.println(stack);

        System.out.println("\n--- Get element from Stack");
        stack.pop();
        System.out.println(stack);

        System.out.println("\n--- Insert element to Stack");
        stack.push(7);
        System.out.println(stack);

        System.out.println("\n--- Insert elements to Stack to match stack size");
        stack.push(10);
        stack.push(4);
        stack.push(7);
        stack.push(20);
        System.out.println(stack);

        System.out.println("\n--- Insert elements over stack size");
        stack.push(4);
        stack.push(7);
        System.out.println(stack);

        System.out.println("\n--- Get elements from Stack");
        for (int i = 0; i < 7; i++) stack.pop();
        System.out.println(stack);
    }
}
