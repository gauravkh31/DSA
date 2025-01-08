public class Size{
    


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





    // function to calculate size using method 1
    public static int size1(Node node){
        int s =0;
     if(node==null){
            return 0;
        }

        s+=size1(node.left);
        s+=size1(node.right);
        s+=1;
        
        return s;
 
    }





    // function to calculate size using method 2
    public static int size2(Node node){
        int s =0;
     if(node==null){
            return 0;
        }

        s+=1;
        s+=size2(node.left);
        s+=size2(node.right);
        
        
        return s;
 
    }




    // function to calculate size using method 3
    public static int size3(Node node){
        if(node==null) return 0;
        return 1 + size3(node.left) + size3(node.right);
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
        System.out.println(size3(root));

    }

}