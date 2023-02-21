import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MyStack stack = new MyStack();
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("MyStack Menu");
            System.out.println("1. Push an item onto the stack");
            System.out.println("2. Pop an item off the stack");
            System.out.println("3. Peek at the top item on the stack");
            System.out.println("4. Check if the stack is empty");
            System.out.println("5. Get the size of the stack");
            System.out.println("6. Clear the stack");
            System.out.println("7. Print the stack");
            System.out.println("8. Quit");
            System.out.print("Enter your choice (1-8): ");
            choice = input.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter an integer to push onto the stack: ");
                    int item = input.nextInt();
                    stack.push(item);
                    System.out.println("Item " + item + " pushed onto the stack");
                }
                case 2 -> {
                    try {
                        int poppedItem = stack.pop();
                        System.out.println("Item " + poppedItem + " popped off the stack");
                    } catch (IllegalStateException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }
                case 3 -> {
                    try {
                        int topItem = stack.top();
                        System.out.println("Top item on the stack is " + topItem);
                    } catch (IllegalStateException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }
                case 4 -> System.out.println("The stack is " + (stack.isEmpty() ? "empty" : "not empty"));
                case 5 -> System.out.println("The size of the stack is " + stack.size());
                case 6 -> {
                    stack.clear();
                    System.out.println("The stack has been cleared");
                }
                case 7 -> {
                    System.out.println("The contents of the stack are:");
                    stack.print();
                }
                case 8 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid choice, please try again");
            }
            System.out.println();
        } while (choice != 8);
    }
}