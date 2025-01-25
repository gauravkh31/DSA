import java.util.*;
public class DisplayStackUsingArray{
    public static void main(String[] args) {
        Stack  <Integer> st = new Stack <>();
        st.push(11);
        st.push(12);
        st.push(13);
        st.push(14);
        st.push(15);
        st.push(16);
        int n = st.size();
        int arr[] = new int[n];
        for(int i = n-1; i>=0; i--){
            arr[i] = st.pop();
        }

        for(int i  =0; i < n ;i++){
            System.out.print(arr[i]+ " ");
            st.push(arr[i]);
        }

        
    }
}