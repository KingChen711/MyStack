public class MyStack {
    private Node top;
    private int size;

    public MyStack() {
        top = null;
        size = 0;
    }

    public void push(int item) {
        Node node = new Node();
        node.value = item;
        node.next = top;
        top = node;
        size++;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            Node curr = top;
            while (curr != null) {
                System.out.println("| " + curr.value + " |");
                curr = curr.next;
            }
        }
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int value = top.value;
        top = top.next;
        size--;
        return value;
    }

    public int top() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return top.value;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void clear() {
        top = null;
        size = 0;
    }

    private static class Node {
        int value;
        Node next;
    }
}
