package recursion1;

public class count {
       static int evenlyDivides(int n) {
        int t = n;   // store a copy of n
        int res = 0; // result counter
        
        while (t != 0) {
            int r = t % 10;   // extract last digit
            
            if (r != 0 && n % r == 0) { // check not zero and divides evenly
                res++;
            }
            
            t = t / 10;  // remove last digit
        }
        
        return res;
    }
}
