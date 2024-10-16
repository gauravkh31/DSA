import java.util.*;
public class ArrayMerge2Sorted{
       public static void main(String[] args) {
        int a[] = {2, 3, 4, 5, 6};
        int b[] = {1, 4, 5, 5, 6, 9, 10};
        int m = 5;
        int n = 7;
        int c[] = new int[m + n];
        int k = 0;
        int i = 0;
        int j = 0;

        // Merge both arrays until one of them is fully traversed
        while (i < m && j < n) {
            if (a[i] <= b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        // If there are remaining elements in array a
        while (i < m) {
            c[k++] = a[i++];
        }

        // If there are remaining elements in array b
        while (j < n) {
            c[k++] = b[j++];
        }

        // Print the merged array
        for (int x = 0; x < c.length; x++) {
            System.out.println(c[x]);
        }
    }
}

       