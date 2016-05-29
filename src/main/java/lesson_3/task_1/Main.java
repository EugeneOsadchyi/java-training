package lesson_3.task_1;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        System.out.println("\n--- Print stack");
        System.out.println(stack);

        System.out.println("\n--- Insert element to lesson_3.task_1.Stack");
        stack.push(5.0);
        System.out.println(stack);

        System.out.println("\n--- Get element from lesson_3.task_1.Stack");
        try {
            stack.pop();
        } catch (Exception e) {
            System.out.println("No elements left!");
        }
        System.out.println(stack);

        System.out.println("\n--- Insert element to lesson_3.task_1.Stack");
        stack.push(7.0);
        System.out.println(stack);

        System.out.println("\n--- Insert elements to lesson_3.task_1.Stack to match stack size");
        stack.push(10.0);
        stack.push(4.0);
        stack.push(7.0);
        stack.push(20.0);
        System.out.println(stack);

        System.out.println("\n--- Insert elements over stack size");
        stack.push(4.0);
        stack.push(7.0);
        System.out.println(stack);

        System.out.println("\n--- Get elements from lesson_3.task_1.Stack");
        try {
            for (int i = 0; i < 7; i++) stack.pop();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(stack);
    }
}
