package stack;



public class usingarray {
    static class stack{
        int t;
        int n;
        int[] arr;
        stack(int n){
            this.n=n;
            arr=new int[n];
            t=-1;
        }
       public  void push(int v){
        if (t==n-1){
            System.out.println("full");
        }
        else
        {
            arr[++t]=v;
        }}

    public void pop(){
        if(t==-1){
            System.out.println("empty");
        }
        else{
            System.out.println(arr[t--]+"out");
        }
    }
 public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[t];
        }

    public boolean isEmpty() {
        return t==-1;
    }

    public  boolean isFull() {
        return t==n-1;
    }
public void display() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
            } else {
                System.out.print("Stack elements: ");
                for (int i = 0; i <= t; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
       stack s = new stack(5);

        s.push(10);
        s.push(20);
        s.push(30);
        s.display();

        s.pop();
        s.display();

        System.out.println("Top element is: " + s.peek());
    
    
    }
}
