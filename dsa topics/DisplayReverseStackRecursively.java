import java.util.*;

public class DisplayReverseStackRecursively {
    // recursive function for reverse stack printing
    public static void reverseRecursive(Stack<Integer> st) {
        if (st.size() <= 0) {
            return;
        }
        int top = st.pop();
        System.out.print(top + " ");
        reverseRecursive(st);
        st.push(top);

    }

    // recursive function for stack printing
    public static void normalRecursive(Stack<Integer> st) {
        if (st.size() <= 0) {
            return;
        }
        int top = st.pop();
        normalRecursive(st);
        
        System.out.print(top + " ");
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
        // reverseRecursive(st);
        reverseRecursive(st);

    }
}