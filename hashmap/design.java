package hashmap;

public class design {
 class node {
        int key, value;
        node next;

        node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
node[] buckets;
int size = 10000;
    public design() {
          buckets = new node[size];
    }
    private int hash(int key){
        return key % size;
    }

    public void put(int key, int value) {
 int index = hash(key);
   if (buckets[index] == null){
            buckets[index] = new node(key, value);
            return;
        }
   node c=buckets[index];
   node p=null;
   while(c!=null){
   if (c.key==key){
      c.value = value;
      return;
   }
   p=c;
   c=c.next;
   }
     p.next = new node(key, value);
    }
    
    public int get(int key) {
        int i=hash(key);
        node c= buckets[i];
   
        while(c!=null){
            if (c.key==key){
              return c.value; }
    c=c.next;
            }
            return -1;
        
    }
    
    public void remove(int key) {
       int i = hash(key);  
        node c = buckets[i];
        node p = null;
        while(c!=null){
            if (c.key==key){
                if (p==null){
                 buckets[i] = c.next;
                }
                else{
                 p.next=c.next;
                }
                return;
            }
            p=c;
            c=c.next;
        }
    }


public static void main(String[] args) {
    design d=new design();
    d.put(0, 3);
    d.put(1, 5);
    System.out.println(d.get(0));
    System.out.println(d.get(1));

}
}
