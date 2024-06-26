import java.util.Stack;
public class Q1 {
    public static void main(String[] args) {
        Stack<String> myStack = new Stack<>();
        myStack.push("5");
        myStack.push("7");
        myStack.push("9");
        System.out.println("Stack: " + myStack);
        String poppedElement = myStack.pop();
        System.out.println("Popped: " + poppedElement);
        System.out.println("Stack after pop: " + myStack);
    }
}