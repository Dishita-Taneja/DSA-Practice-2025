package hashmap;

import java.util.HashMap;

public class valid {
     public static  boolean isAnagram(String s, String t) {
        int n=s.length();
        int m=t.length();
        if (n!=m){
            return false;
        }
 HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();
       for (char c : s.toCharArray()) {
            mapS.put(c, mapS.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            mapT.put(c, mapT.getOrDefault(c, 0) + 1);
        }

        return mapS.equals(mapT);
    }
     public static boolean Anagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;   // increase count for s
            freq[t.charAt(i) - 'a']--;   // decrease count for t
        }

        for (int count : freq) {
            if (count != 0) return false;
        }

        return true;
    }
    public static void main(String[] args) {
       String s = "anagram";
       String t = "nagaram";
System.out.println(isAnagram(s, t));
System.out.println(Anagram(s, t));
    }
}
