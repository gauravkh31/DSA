import java.util.Stack;

public class StackPreviousSmallerElement {
    public static void main(String[] args) {
        int input[] = {2, 4, 1, 6, 3, 4, 2, 5};
        int n = input.length;
        int output[] = new int[n];
        Stack<Integer> st = new Stack<>(); // Stack to store indices

        for (int i = 0; i < n; i++) {
            // While the stack is not empty and the element at the top of the stack is greater than or equal to the current element
            while (!st.isEmpty() && input[st.peek()] >= input[i]) {
                st.pop(); // Pop the index from the stack
            }

            // If the stack is empty, no smaller element exists before the current element
           
            
            if (!st.isEmpty() && input[st.peek()] < input[i]){
                // The element at the index stored at the top of the stack is the previous smaller element
                output[i] = input[st.peek()];
            }
          
            // If the stack is empty, no smaller element exists before the current element
            if (st.isEmpty()) {
                output[i] = -1;
            } 

            // Push the current index into the stack
            st.push(i);
        }

        // Print the output array
        for (int i = 0; i < n; i++) {
            System.out.print(output[i] + " ");
        }
    }
}
