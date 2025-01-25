import java.util.*;

public class StackPushBottomRecursion {
    public static void pushBottonm(Stack <Integer> st, int x){
        if(st.size()==0){
            st.push(x);
            return;
        }
         int top = st.pop();
            pushBottonm(st,x);
            st.push(top);
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
        System.out.println("Enter a element to push at bottom using recursion: ");
        int x = sc.nextInt();

        pushBottonm(st,x);
        System.out.println(st);
        

    }
    
}
