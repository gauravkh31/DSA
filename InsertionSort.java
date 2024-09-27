import java.util.*;
public class InsertionSort {
    public static void swap(int [] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter array elements: ");
        int [] a = new int[n];
        for(int i =0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }

        for(int i =1; i < n ; i++){
            int j = i;
            while(j>0&&a[j]<a[j-1]){
                swap(a,j,j-1);
                j--;
            }
        }

        System.out.println("Sorted array is: ");
        for(int i = 0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }

    }
}
