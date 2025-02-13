import java.util.*;
public class LevelOrderZigZag{
     
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

  
    // function to print tree in level order zig zag traversal
    public static void levelOrderZigZag(Node node){
        Stack<Node> m = new Stack<>();
        Stack<Node> c = new Stack<>();
        int level =1;
        m.add(node);
        while(m.size()>0){
            node = m.pop();
            System.out.print(node.data+" ");
            if(level%2==1){
                for(int i =0; i < node.children.size();i++){
                    c.push(node.children.get(i));
                }
            }else{
                for(int i = node.children.size()-1; i>=0; i--){
                    c.push(node.children.get(i));
                }
            }
            
            if(m.size()==0){
                m=c;
                c=new Stack<>();
                level++;
                System.out.println();
            }
        }
        
       
    }

   

    public static void main(String[] args) {
        int[] arr ={10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
        Node node = create(arr);
        levelOrderZigZag(node);


    }
}