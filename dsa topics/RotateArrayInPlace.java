import java.util.*;
public class RotateArrayInPlace {
    
    public static void swap(int [] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int [] arr, int i , int j){ // here i and j are kaha se kaha tk reverse krna hai array me

        for(int p = i ; p <= j ; p++){
            swap(arr, i , j);
             i++;
             j--;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
    
        int [] array = new int[size];
    
        System.out.println("Enter array elements:");
        for(int i = 0; i < size ; i++){
            array[i] = sc.nextInt();
        }


        System.out.println("Enter no. of rotations:");
        int k = sc.nextInt();

        k = k%size;

        reverse(array, 0, size-k-1);
        reverse(array, size-k , size-1);
        reverse(array, 0, size-1);

        System.out.println("The reversed array is: ");
        for(int i =0 ; i < size; i++){
            System.out.println(array[i]);
        }






        sc.close();
    }
}
