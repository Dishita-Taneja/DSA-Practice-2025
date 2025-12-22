package dpstrings;

public class robin {

    static final int d = 256;  // number of characters

    static void search(String text, String pattern, int q) {
        int n = text.length();
        int m = pattern.length();
        int i, j;
        int p = 0; // hash value for pattern
        int t = 0; // hash value for text
        int h = 1;

        // h = pow(d, m-1) % q
        for (i = 0; i < m - 1; i++)
            h = (h * d) % q;

        // Calculate initial hash values
        for (i = 0; i < m; i++) {
            p = (d * p + pattern.charAt(i)) % q;
            t = (d * t + text.charAt(i)) % q;
        }

        // Slide the pattern
        for (i = 0; i <= n - m; i++) {

            // If hash matches, check characters
            if (p == t) {
                for (j = 0; j < m; j++) {
                    if (text.charAt(i + j) != pattern.charAt(j))
                        break;
                }
                if (j == m)
                    System.out.println("Pattern found at index " + i);
            }

            // Calculate hash for next window
            if (i < n - m) {
                t = (d * (t - text.charAt(i) * h)
                        + text.charAt(i + m)) % q;

                // Make hash positive
                if (t < 0)
                    t = (t + q);
            }
        }
    }

    public static void main(String[] args) {
        String text = "ABAAABCDBBABCDDEBCABC";
        String pattern = "ABC";
        int q = 101; // prime number

        search(text, pattern, q);
    }
}
