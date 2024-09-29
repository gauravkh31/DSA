import java.util.*;
public class InsertionInStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack <>();
        st.push(12);
        st.push(13);
        st.push(14);
        st.push(15);
        st.push(16);
        System.out.println(st);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a element you want to insert: ");
        int x = sc.nextInt();
        System.out.println("Enter a index where you want to insert: ");
        int idx = sc.nextInt();
        // temp stack
        Stack <Integer> temp = new Stack<>();
        while(st.size()>idx){
            temp.push(st.pop());
        }
        st.push(x);
        while(temp.size()>0){
            st.push(temp.pop());
        }
        System.out.println(st);
        sc.close();

    }
    
}
