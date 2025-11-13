package stack;

import java.util.Stack;
public class StockSpanner {
    private Stack<int[]> stack; // each element: [price, span]

    public StockSpanner() {
        stack = new Stack<>();
    }

    public int next(int price) {
        int span = 1;

        // merge consecutive smaller or equal prices
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1];
        }

        stack.push(new int[]{price, span});
        return span;
}
public static void main(String[] args) {
        StockSpanner ss = new StockSpanner();
        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        for (int price : prices) {
            System.out.println("Price: " + price + ", Span: " + ss.next(price));
        }
    }
}