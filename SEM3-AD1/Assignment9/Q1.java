class Q1 {
    private int maxSize;
    private int top;
    private int[] stackArray;

    Q1(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
            System.out.println("Pushed: " + value);
        } else {
            System.out.println("Stack is full. Cannot push " + value);
        }
    }

    public int pop() {
        if (top >= 0) {
            int poppedValue = stackArray[top--];
            System.out.println("Then");
            System.out.println("Popped: " + poppedValue);
            return poppedValue;
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }
    }

    public static void main(String[] args) {
        Q1 stack = new Q1(3);
        stack.push(50);
        stack.push(70);
        stack.push(80);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }
}