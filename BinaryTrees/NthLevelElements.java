public class NthLevelElements{




     // creating a node class
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }


    // function to display a binary tree 
    public static void display(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.val+"->");
        if(node.left!=null) System.out.print(node.left.val+" ");
        if(node.right!=null) System.out.print(node.right.val+" ");
        System.out.println();
        display(node.left);
        display(node.right);

    }





    // function to print elements at nth level
    public static void nthlevel(Node node,int level){
       if(node == null) return;
       if(level ==1) System.out.print(node.val + " ");

       nthlevel(node.left, level-1);
       nthlevel(node.right,level-1);
         
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b; 
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        Node f = new Node(7);
        b.left = e;
        b.right = f;
        nthlevel(root,3);

    }



}