package stack;
import java.util.Stack;

public class Minstack {
    private Stack<Integer> mainStack;
    private Stack<Integer> minStack;

    public  Minstack() { // constructor name matches class name
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        mainStack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        int removed = mainStack.pop();
        if (removed == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        return mainStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        Minstack st = new Minstack(); // class and constructor names match
        st.push(-2);
        st.push(0);
        st.push(-3);
        System.out.println(st.getMin()); // Output: -3
        st.pop();
        System.out.println(st.top());    // Output: 0
        System.out.println(st.getMin()); // Output: -2
    }
}