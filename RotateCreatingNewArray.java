import java.util.*;
public class RotateCreatingNewArray {
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

        int finalNoOfRotations = k%size;

        int reversedArray[] = new int[size];
        int j =0 ;

        for(int i = size-finalNoOfRotations ; i <= size-1; i++){
            reversedArray[j] = array[i];
            j++;
        }

        for (int i = 0 ; i<= size-finalNoOfRotations-1; i++){
            reversedArray[j] = array[i];
            j++;
        }

        System.out.println("The reversed array is: ");
        for(int i =0 ; i < size; i++){
            System.out.println(reversedArray[i]);
        }
        sc.close();
    }
}
