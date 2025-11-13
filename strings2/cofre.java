package strings2;

public class cofre {
    public static void main(String[] args) {
        String str="takeuforward";
        int[] freq = new int[26];      // frequency array for 'a' to 'z'

for (int i = 0; i < str.length(); i++) {
    freq[str.charAt(i) - 'a']++;   // count each character
}

for (int i = 0; i < 26; i++) {
    if (freq[i] != 0) {
        System.out.print((char)(i + 'a'));
        System.out.print(freq[i] + " ");
    }
}
    }
}
