package hashmap;

public class cow {
    public static String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;

        // Frequency arrays for digits 0–9
        int[] secdigs = new int[10];
        int[] guessdigs = new int[10];

        // 1) First pass → count bulls and store frequencies of non-bull digits
        for (int i = 0; i < secret.length(); i++) {
            char s = secret.charAt(i);
            char g = guess.charAt(i);

            if (s == g) {
                bulls++;
            } else {
                secdigs[s - '0']++;
                guessdigs[g - '0']++;
            }
        }

        // 2) Second pass → count cows using minimum frequency
        for (int i = 0; i < 10; i++) {
            int minVal = secdigs[i];
            if (minVal > guessdigs[i]) {
                minVal = guessdigs[i];
            }
            cows += minVal;
        }

        return bulls + "A" + cows + "B";
    }

    public static void main(String[] args) {
        String secret = "1807";
        String guess = "7810";
        System.out.println(getHint(secret, guess)); // Output: 1A3B
    }
}
  
// or one array approach 