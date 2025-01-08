import java.util.*;
public class IsSimilar{




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





    // function to return a boolean value if tree is similar or not
    public static boolean aresimilar(Node n1,Node n2){
        if(n1.children.size()!=n2.children.size()){
            return false;
        }
        for(int i =0; i < n1.children.size();i++){
            Node c1 = n1.children.get(i);
            Node c2 = n2.children.get(i);
            if(aresimilar(c1, c2)==false){
                return false;
            }
        }
        return true;
    }





  
  
   

    public static void main(String[] args) {
        int[] arr ={10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
        Node node1 = create(arr);
        int[] arr2 ={100,200,500,-1,600,-1,-1,300,700,-1,800,1100,-1,1200,-1,-1,900,-1,-1,400,1000,-1,-1,-1};
        Node node2= create(arr2);
        System.out.println(aresimilar(node1,node2));


    }
}