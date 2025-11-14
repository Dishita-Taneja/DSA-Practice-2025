package binarytree;

public class same {
    static class tree{
        int val;
        tree left;
        tree right;
        tree(int x){
            this.val=x;
        }
    }
     public boolean isSameTree(tree p, tree q) {
        if (p==null&&q==null){
            return true;
        }
         if (p==null||q==null){
            return false;
        }
        if (p.val!=q.val){
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        
    }
    public static void main(String[] args) {
        same s=new same();
        tree p= new tree(1);
          p.left= new tree(2);
          p.right= new tree(3);
     tree q= new tree(1);
       q.left= new tree(2);
     q.right= new tree(3);
        System.out.println(s.isSameTree(p,q));
    }
}
