import java.util.*;
public class SecondMax {
    public static void main(String[] args) {
        
    

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array:");
    int size = sc.nextInt();

    int [] array = new int[size];

    System.out.println("Enter array elements:");
    for(int i = 0; i < size ; i++){
        array[i] = sc.nextInt();
    }

    int min = Integer.MAX_VALUE;
    for(int i =0; i < size; i++){
        if(array[i] < min){
            min = array[i];

        }
    }

    for(int i =0; i < size; i++){
        if(array[i] == min){
            array[i] = Integer.MAX_VALUE;
            
        }
    }
    int secondmin = Integer.MAX_VALUE;
    for(int i =0; i < size; i++){
        if(array[i] < secondmin){
            secondmin = array[i];
            
        }
    }

    System.err.println(secondmin);
    

    sc.close();
}
}