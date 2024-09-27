import java.util.*;
public class PrintSumInRangeInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get the number of queries
        System.out.println("Enter number of queries: ");
        int q = sc.nextInt();

        // Get the size of the array
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
    
        int[] array = new int[size];
    
        // Input the array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        // Display the original array
        System.out.println("The original array is:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Compute the prefix sum array
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i] + array[i-1];
        }

        // Display the prefix sum array
        System.out.println("Prefix sum array is:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Handle the queries
        for (int i = 1; i <= q; i++) {
            System.out.println("Enter lower range (1-based index): ");
            int l = sc.nextInt();
            System.out.println("Enter upper range (1-based index):");
            int r = sc.nextInt();

            // Convert to 0-based index
            l = l - 1;
            r = r - 1;

            // Calculate and print the sum in the given range
            if (l == 0) {
                // If l is 0 (which means the original l was 1), just use array[r]
                System.out.println("Prefix Sum between the given range is: " + array[r]);
            } else {
                System.out.println("Prefix Sum between the given range is: " + (array[r] - array[l - 1]));
            }
        }

        sc.close();
    }
}
