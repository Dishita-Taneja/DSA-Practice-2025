package queue;

import java.util.Stack;

public class stoq {
Stack<Integer> s1;
Stack<Integer> s2;
    public stoq() {
       s1=new Stack<>();
        s2=new Stack<>();
    }
    
    public void push(int x) {
        s1.push(x);
    }
    
    public int pop() {
        move();
        return s2.pop();
    }
    
    public int peek() {
        move();
         return s2.peek();
    }
    
    public boolean empty() {
       return s1.isEmpty()&&s2.isEmpty(); 
    }
    public void move(){
        if (s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
    }
public static void main(String[] args) {
        stoq q = new stoq();

        q.push(1);
        q.push(2);
        System.out.println(q.peek());  // 1
        System.out.println(q.pop());   // 1
        System.out.println(q.empty()); // false
    }
}
