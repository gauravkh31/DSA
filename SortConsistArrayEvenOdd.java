import java.util.*;
public class SortConsistArrayEvenOdd {

    public static void swap(int [] arr, int i , int j ){
        int temp = arr[i];
        arr[i] = arr[j]; 
        arr[j]= temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
    
        int [] array = new int[n];
    
        System.out.println("Enter array elements:");
        for(int i = 0; i < n ; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("UnSorted array is : ");
        for(int p =0; p < array.length; p++){
            System.out.println(array[p]);
        }

        int i =0; 
        int j = array.length-1;
        while(i < j){
            if(array[i] % 2==1 && array[j] % 2==0){
                swap(array, i, j);
                i++;
                j--;

            }
            if(array[i] % 2==0){
                i++;
            }
            if(array[j] % 2==1){
                j--;
            }
        }
        System.out.println("Sorted array is : ");
        for(int k =0; k < array.length; k++){
            System.out.println(array[k]);
        }


        sc.close();
    }
}
