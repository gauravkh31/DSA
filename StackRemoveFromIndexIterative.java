import java.util.*;
public class StackRemoveFromIndexIterative {
public static void remove(Stack <Integer> st, int idx){
       Stack<Integer> temp = new Stack<>();
       while(st.size()>idx+1){
        temp.push(st.pop());
       }
       st.pop();
       while(temp.size()>0){
        st.push(temp.pop());
       }
        }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(11);
        st.push(12);
        st.push(13);
        st.push(14);
        st.push(15);
        st.push(16);
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a index from where you want to pop a element:  ");
        int idx = sc.nextInt();

       remove(st,idx);
        System.out.println(st);
        

    }
    
}


