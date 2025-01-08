import java.util.*;
public class AreMirror{
    


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





    // function to return a boolean value if tree are mirrors or not
    public static boolean aremirrors(Node n1,Node n2){
        if(n1.children.size()!=n2.children.size()){
            return false;
        }
        for(int i =0; i < n1.children.size();i++){
            int j = n2.children.size()-1-i;
            Node c1 = n1.children.get(i);
            Node c2 = n2.children.get(j);
            if(aremirrors(c1, c2)==false){
                return false;
            }
        }
        return true;
    }





  
  
   

    public static void main(String[] args) {
int[] arr1 = {1, 2, 4, -1, 5, -1, -1, 3, 6, -1, 7, -1, -1, -1};
        Node node1 = create(arr1);
int[] arr2 = {10, 30, 70, -1, 60, -1, -1, 20, 50, -1, 40, -1, -1, -1};
        Node node2= create(arr2);
        System.out.println(aremirrors(node1,node2));


    }
}