package array;

public class count {
    static int maxFrequencyElements(int[] arr) {
       int maxVal = arr[0];
       int n= arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        int[] c = new int[maxVal + 1];
        for (int i = 0; i <= maxVal; i++) {
            c[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            c[arr[i]]++;
        }
        int m=0;
        for(int i = 0; i < c.length; i++){
if (m<c[i]){
    m=c[i];
}}
int r=0;
  for(int i = 0; i < c.length; i++){
if (m==c[i]){
    r+=m;
}}
return r;
    }

    public static void main (String[] args){
        int[] arr={1,2,2,3,1,4};
      int  f= maxFrequencyElements(arr);
        System.out.println(f);
    
    }
}
