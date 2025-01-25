import java.util.*;

public class queueReverseK {
    public static void reverse(Queue<Integer> q, int k){
        int n = q.size();
        int p =k;
        int r = n-p;
        Stack<Integer> st = new Stack<>();
        while(k>0){
            st.add(q.remove());
            k--;
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        while(r>0){
            q.add(q.remove());
            r--;
        }
System.out.println(q);

    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5); 
        reverse(q,3);

            
        
    }
    
}
