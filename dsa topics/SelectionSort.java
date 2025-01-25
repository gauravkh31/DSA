import java.util.*;
public class SelectionSort {
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

        for(int i = 0; i < n-1; i++){
            int minIndex = i;
            for(int j = i+1 ; j < n ; j++){
                if(a[j]<a[minIndex]){
                    minIndex=j;
                }

            }
            if(minIndex!=i){
            swap(a,i,minIndex);
            }
        }
        System.out.println("Sorted array is: ");
        for(int i = 0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}
