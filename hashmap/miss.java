package hashmap;
    import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class miss {
    public static char getMaxOccuringChar(String s) {
        int[] freq = new int[26];  // for 'a' to 'z'

        // Count frequencies
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int max = 0;
        char ans = 'a';

        // Check from 'a' to 'z' → ensures lexicographical smallest on tie
        for (int i = 0; i < 26; i++) {
            if (freq[i] > max) {
                max = freq[i];
                ans = (char) (i + 'a');
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        String s= "testsample";
        System.out.println(getMaxOccuringChar(s));
    }

}
