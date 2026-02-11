package dp;

public class profit {
    public static void main(String[] args) {
        int[] start={1,2,3};
        // int[] end={3,4,5};
        int[] profit={50,10,40};
        int n=3;
        int m=0;
        for(int i=0;i<n;i++){
            m=i;
            for(int j=0;j<n;j++){
                if (profit[j]>profit[m]){
                    m=j;
                }
            }
      int temp = profit[i];
        profit[i] = profit[m];
       profit[m] = temp;

        int t = start[i];
        start[i] = start[m];
       start[m] = t;
// since this way is one to make the coins interchange problem solved without dp 
       
        }
    }
}
