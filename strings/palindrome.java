package strings;

public class palindrome {
     static boolean isPalindrome(String s) {
     StringBuilder res=new StringBuilder();
     for (char c:s.toCharArray()){
        if (Character.isLetterOrDigit(c)){
           res.append(Character.toLowerCase(c));
        }
     }
     String t = res.toString();
     return t.equals(res.reverse().toString());
    }
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
