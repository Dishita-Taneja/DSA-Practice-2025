package stack;
    import java.util.*;
public class aster {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int a : asteroids) {
            boolean destroyed = false;

            // Collision only happens when stack top is moving right and current is moving left
            while (!stack.isEmpty() && a < 0 && stack.peek() > 0) {
                if (stack.peek() < -a) {
                    stack.pop(); // top asteroid is smaller, destroyed
                    continue;
                } else if (stack.peek() == -a) {
                    stack.pop(); // both same size, destroy both
                }
                destroyed = true; // current asteroid destroyed
                break;
            }

            if (!destroyed) {
                stack.push(a);
            }
        }

        // convert stack to array
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
    public static void main(String[] args) {
        int[] arr={10, 2, -5, -11, 12, -3};
        int[] res=asteroidCollision(arr);
        System.out.println(Arrays.toString(res));
    }

}
