public class Stack {
    private static final int MAX_SIZE = 10;
    private int[] elements;
    private int top; // represents index of top element

    public Stack() {
        elements = new int[MAX_SIZE];
        top = -1;
    }

    // push
    public void push(int element) {
        if (!isFull()) {
            top++;
            elements[top] = element;
            System.out.println("Pushed: " + element);
        } else {
            System.out.println("Stack is full. Cannot push element " + element);
        }
    }

    // pop
    public int pop() {
        if (!isEmpty()) {
            int poppedElement = elements[top];
            top--;
            System.out.println("Popped: " + poppedElement);
            return poppedElement;
        } else {
            System.out.println("Stack is empty. Cannot pop element");
            return -1;
        }
    }

    // isEmpty
    public boolean isEmpty() {
        return top == -1;
    }
    //isFull
    public boolean isFull() {
        return top == MAX_SIZE - 1;
    }
    //peek - returns the last element entered into the array (Stack)
    public int peek() {
        if(!isEmpty()) {
            return elements[top];
        } else {
            System.out.println("Stack is empty. Cannot pop element");
            return -1;
        }
    }

    //size
    public int size() {
        return top + 1;
    }
}