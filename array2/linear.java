public class linear{
     static int search(int arr[], int x) {
      
        for (int i=0;i<arr.length;i++){
            if (x==arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,5,7,7,0};
        int k=5;
int s=search(arr, k);
System.out.println(s);
        k=9;
  s=search(arr, k);
  System.out.println(s);
    }
}