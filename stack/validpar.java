package stack;

public class validpar {
    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) return false; // Odd length can't be valid

        while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
        }

        return s.isEmpty(); // If everything matched, string should be empty
    
    }
    public static void main(String[] args) {
        String s = "()";
        System.out.println(isValid(s));
    }
}


// using stack 

//  Stack<Character> stack = new Stack<>();
// for (char c : s.toCharArray()) {
//     if (c == '(' || c == '{' || c == '[') {
//                 stack.push(c);
//             } 
//  else {
//     if (stack.isEmpty()) return false; 
//      char top = stack.pop();
//       if ((c == ')' && top != '(') ||
//                     (c == '}' && top != '{') ||
//                     (c == ']' && top != '[')) {
//                     return false;
//                 }
//             }
//     }
//      return stack.isEmpty();