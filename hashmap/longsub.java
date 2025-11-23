package hashmap;

public class longsub {
    public static int lengthOfLongestSubstring(String s) {
        int[] freq = new int[128];
        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            freq[s.charAt(right)]++;

            while (freq[s.charAt(right)] > 1) {
                freq[s.charAt(left)]--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
      String s = "abcabcbb";
      System.out.println(lengthOfLongestSubstring(s));  
    }
}
