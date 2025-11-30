package bitmanipulation;

public class countsetbits {
     public static int count(int n){
        int total = 0;

        for(int i = 0; (1 << i) <= n; i++){
            int power = 1 << i;                // 2^i
            int group = power * 2;             // 2^(i+1)

            int fullGroups = (n + 1) / group;  
            total += fullGroups * power;

            int remaining = (n + 1) % group;
            total += Math.max(0, remaining - power);
        }

        return total;
    }
    public static void main(String[] args) {
        System.out.println(count(4));
    }
}
