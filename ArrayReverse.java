
        
import java.util.*;
public class ArrayReverse {

    public static void swap(int [] arr, int i,int j){
        arr[i] = arr[i]+arr[j];
        arr[j] = arr[i]-arr[j];
        arr[i] = arr[i]-arr[j];
    }
    public static void main(String[] args) {
        System.out.println("Enter array size to reverse");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] array = new int[size];
        System.out.println("Enter array elements:");

        for(int i =0 ; i<size; i++){
            array[i] = sc.nextInt();

        }

        int i =0 ; 
        int j =size-1;

        while(i<j){

            swap(array, i,j);
            i++;
            j--;

        }
        System.out.println("Array is: ");
        for(int k =0; k < size; k++){
            System.out.println(array[k]);

        }

        sc.close();
    }
}

 
