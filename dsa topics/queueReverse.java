import java.util.*;
public class queueReverse{
    public static void reverse(Queue<Integer> q){
        int n = q.size();
        Stack<Integer> st =  new Stack<>();
        while(q.size()>0){
            st.add(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        System.out.println(q);
    }


    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>() ;
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
            q.add(6);

            
        
        reverse(q);
        
    }
}