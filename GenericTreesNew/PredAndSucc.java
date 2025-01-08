import java.util.*;
public class PredAndSucc{
    
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











// function of multiSolvers
static Node predessor;
static Node successor;
static int state;
public static void pands(Node node,int data){
    if(state==0){
        if(node.data==data){
            state=1;
        }else{
            predessor=node;
        }
    }else if(state==1){
        successor=node;
        state =2;
    }
    for(Node child: node.children){
        pands(child,data);
    }
}
    









    public static void main(String[] args) {
        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
        Node node = create(arr);
        int[] arr1 = {1, 2, 4, -1, 5, -1, -1, 3, 6, -1, 7, -1, -1, -1};
        Node node1 = create(arr1);
        int[] arr2 = {10, 30, 70, -1, 60, -1, -1, 20, 50, -1, 40, -1, -1, -1};
        Node node2 = create(arr2);
        int[] arr3 = {1, 2, 4, -1, 5, -1, -1, 3, -1, 6, 7, -1, -1, -1};
        Node node3 = create(arr3);

        successor=null;
        predessor=null;
        pands(node, 10);
        if(successor==null){
            System.out.println("successor not found");
        }else{
        System.out.println("Successor is: " + successor.data);

        }



                if(predessor==null){
            System.out.println("predessor not found");
        }else{
        System.out.println("predessor is: " + predessor.data);

        }


        
    }


}