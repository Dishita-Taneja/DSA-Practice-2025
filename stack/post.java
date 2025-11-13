package stack;
  import java.util.*;
public class post {

    public static int evaluatePostfix(String[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (String token : arr) {
            // If token is an operator
            if (token.equals("+") || token.equals("-") || 
                token.equals("*") || token.equals("/") ||
                token.equals("^")) {

                int b = stack.pop(); // 2nd operand
                int a = stack.pop(); // 1st operand
                int result = 0;

                switch (token) {
                    case "+": result = a + b; break;
                    case "-": result = a - b; break;
                    case "*": result = a * b; break;
                    case "/":
                        // floor division as per problem statement
                        result = (int)Math.floor((double)a / b);
                        break;
                    case "^":
                        result = (int)Math.pow(a, b);
                        break;
                }

                stack.push(result);
            } 
            else {
                // It's a number
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    // For testing
    public static void main(String[] args) {
        String[] arr = {"2", "3", "1", "*", "+", "9", "-"};
        System.out.println(evaluatePostfix(arr)); // ✅ Output: -4
    }

}
