import java.util.*;
class StackClass{
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(11);
        st.push(12);
        int r = st.push(13);
        System.out.println(r);
        st.push(14);
        st.push(15);
        int size = st.size();
        System.out.println(size);
        System.out.println(st);
        int p = st.pop();
        System.out.println("mine"+p);
        System.out.println(st);
        int k = st.peek();
        System.out.println(k);
        System.out.println(st);
        
    }
}