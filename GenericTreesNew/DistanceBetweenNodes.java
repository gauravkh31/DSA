import java.util.*;
public class DistanceBetweenNodes{




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





    // function to return a node to root path type arraylist in a generic tree 
    public static ArrayList<Integer> nodetoroot(Node node, int element){
        if(node.data==element){
           ArrayList<Integer> list = new ArrayList<>();
           list.add(node.data);
           return list;

        }
        for(Node child: node.children){
            ArrayList<Integer> pic = nodetoroot(child,element);
            if(pic.size()>0){
                pic.add(node.data);

                return pic;
            }
        }
        return new ArrayList<>();
    }





  
    // function to find distance between two nodes in a generic tree
    public static int distance(Node node, int d1, int d2){
        ArrayList<Integer> l1 = nodetoroot(node, d1);
        ArrayList<Integer> l2 = nodetoroot(node,d2);
        int i = l1.size()-1;
        int j = l2.size()-1;
        while(i>=0 && j>=0 && l1.get(i)==l2.get(j)){
            i--;
            j--;
        }
        i++;
        j++;
        return i+j;
       
    }

   

    public static void main(String[] args) {
        int[] arr ={10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
        Node node = create(arr);
        System.out.println(distance(node,40,30));


    }
}