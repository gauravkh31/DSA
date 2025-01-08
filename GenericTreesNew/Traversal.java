import java.util.*;
public class Traversal{
    
     // this is the node class which will have a data and a list of children
    public static class Node {

        int data;
        ArrayList<Node> children = new ArrayList<>();

        // first constructor of node class
        Node(int data) {
            this.data = data;
            this.children = new ArrayList<>();
        }

        // second constructor of node class
        Node() {
            this.data = 0;
            this.children = new ArrayList<>();
        }

    }

   
   // function to create a generic tree with a children list which have more than 2
    public static Node create(int[] arr) {

        Stack<Node> st = new Stack<>();

        Node root = null;
        for (int e : arr) {
            if (e == -1) {
                st.pop();
            } else {
                Node t = new Node();
                t.data = e;

                if (st.isEmpty()) {
                    root = t;
                } else {
                    st.peek().children.add(t);
                }
                st.push(t);
            }
        }
        return root;

    }

  
    // function to find height of tree in terms of depth/edge
    public static void doTraversal(Node node){
        System.out.println("Node pre"+node.data);
        for(Node child: node.children){
            System.out.println("Edge pre"+node.data+"-"+child.data);
            doTraversal(child);
            System.out.println("Edge post"+node.data+"-"+child.data);

        }
        System.out.println("Node post"+node.data);
       
    }

   

    public static void main(String[] args) {
        int[] arr ={10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
        Node node = create(arr);
        doTraversal(node);


    }
}
