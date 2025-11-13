package recursion1;

public class factorial {
    static int fact(int n)
    {
        int res = 1, i;
        for (i = 2; i <= n; i++)
            res *= i;
        return res;
    }

    public static void main(String[] args)
    {
        int n = 5;
        System.out.println(fact(n));
    }
}
