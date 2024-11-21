import java.util.*;

public class GenericTree {
    public static class Node{
        int data; 
        ArrayList<Node> children = new ArrayList<>();

    }


    public static Node create(int [] arr){


        Stack<Node> st = new Stack<>();

        Node root= null;
        for(int e: arr){
            if(e==-1){
                st.pop();
            }else{
                Node t = new Node();
                t.data = e; 

                if(st.isEmpty()){
                    root = t; 
                }else{
                    st.peek().children.add(t);
                }
                st.push(t);
            }
        }
        return root;

    }





    public static void display(Node node) {
        String str = node.data + " -> ";
        for (Node child : node.children) {
            str+=child.data+",";
        }
        str+=".";
        System.out.println(str);

        for (Node child : node.children) {
            display(child);
        }
    }



    public static int totalLength(Node node){
        int size =1; 
        for(Node child : node.children){
            size += totalLength(child);
        }
        return size;
    }




    public static int maximum(Node node){
        int maxVal = node.data;
        for(Node child: node.children){
            maxVal = Math.max(maxVal, maximum(child));
            
        }
        
        return maxVal;
    }

    public static void main(String[] args) {
        int [] arr = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
        

        Node ex = create(arr);
       


        display(ex);
       

        int size = totalLength(ex);
        System.out.println(size);
        System.out.println(maximum(ex));







        
    }
    
}
