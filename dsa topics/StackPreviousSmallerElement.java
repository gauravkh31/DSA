import java.util.Stack;

public class StackPreviousSmallerElement {
    public static void main(String[] args) {
        int input[] = {2,4,1,6,3,4,2,5};
        int n = input.length;
        int output [] = new int[n];
        Stack<Integer> st = new Stack<>();
        
        for(int i = n-1; i >=0; i--){
            if(st.empty()){
                st.push(i);
            }

            while(!st.empty() && input[st.peek()]>input[i]){
                output[st.peek()] = input[i];
                st.pop();
            }
            st.push(i);
        }
        while(!st.empty()){
            output[st.peek()]= -1;
            st.pop();
        }
        for(int i =0 ; i <n ; i++){
            System.out.print(output[i]+ " ");
        }
    }
}
