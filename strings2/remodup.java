package strings2;

import java.util.HashSet;

public class remodup {
    public static void main(String[] args) {
        String s="grrrttuug";
         HashSet<Character> uni = new HashSet<>();
      StringBuilder ans = new StringBuilder();
 for (char c : s.toCharArray()) {
if (!uni.contains(c)){
    ans.append(c);
    uni.add(c);
}
 }
 System.out.println(ans.toString());
    }
    
}
