public class App {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Size of stack is: " + stack.size());

        System.out.println("Top element: " + stack.peek());

        while (!stack.isEmpty()) {
            stack.pop();
        }

        System.out.println("Size of stack is: " + stack.size());
    }
}
