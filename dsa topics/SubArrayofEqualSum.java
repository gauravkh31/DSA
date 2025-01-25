import java.util.*;
public class SubArrayofEqualSum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
    
        int [] array = new int[size];
    
        System.out.println("Enter array elements:");
        for(int i = 0; i < size ; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Given Array is: ");
        for(int i =0 ; i< array.length; i++){
            System.out.println(array[i]);
        }

        
        for(int i =1 ; i< array.length; i++){
            array[i] += array[i-1];
        }

        // System.out.println("prefix Array is: ");
        // for(int i =0 ; i< array.length; i++){
        //     System.out.println(array[i]);
        // }

        for(int i = 0; i < array.length; i++){
            if(array[i] == array[size-1] - array[i]){
                System.out.println("Subarrays are possible of equal sum.");
                return;
            }
        }
        System.out.println("No subarray possible.");

        sc.close();
    }
    
}
