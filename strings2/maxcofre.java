package strings2;

public class maxcofre {
    public static void main(String[] args) {
        String str = "takeuforward";
        int[] freq = new int[26]; // frequency array for 'a' to 'z'

        // count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }

        int m = 0;
        char c = ' '; // initialize character variable

        // find character with maximum frequency
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                if (m < freq[i]) {
                    m = freq[i];
                    c = (char) (i + 'a');
                }
            }
        }

        // print result
        System.out.println(c + " -> " + m);
    }
}