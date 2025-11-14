package binarytree;

public class symmetric {
      static class tree{
        int val;
        tree left;
        tree right;
        tree(int x){
            this.val=x;
        }
    }

     public boolean isSymmetric(tree root) {
        if (root ==null){
            return true;
        }
        return mir(root.left,root.right);
    }
    public boolean mir(tree r1,tree r2) {
        if (r1==null&&r2==null){
            return true;
        }
        if (r1==null||r2==null){
            return false;
        }
        if (r1.val!=r2.val){
            return true;
        }
        return mir(r1.left,r2.right) && mir(r1.right,r2.left);
        }
        public static void main(String[] args) {
            symmetric t= new symmetric();
            tree root=new tree(1);
root.left=new tree(2);
root.right=new tree(2);
root.left.right=new tree(3);
root.right.right=new tree(3);
System.out.println(t.isSymmetric(root));
        }
}
