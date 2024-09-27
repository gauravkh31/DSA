import java.util.Scanner;

public class Search {
    
    public static void main(String[] args) {
        // int array[] = { 4,5,6,7,8};
        // int target = 0;

        // for(int i = 0 ; i< array.length; i++){
        //     if(array[i] == target){
        //         System.out.println("Element found at index " + i);
        //         return;
        //     }
           
        // }
        // System.out.println(-1);
        Scanner sc = new Scanner(System.in);

        int array [] = new int[4];
        int i = 0;
        while ( i < array.length){
            array[i]= sc.nextInt();
            i++;
        }
        System.out.println("array elements:");
i = 0;
        while ( i < array.length){
            
            System.out.println(array[i]);
            i++;
        }
sc.close();
    }
}
