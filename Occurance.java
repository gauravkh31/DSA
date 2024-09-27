import java.util.Scanner;

public class Occurance {
    

    public static void input (int [] array){
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < array.length; i++) {
                System.out.println("Enter the element at index " + i);
                array[i] =   sc.nextInt();
   }
        }
}


public static void print(int [] array){
    for (int i = 0; i < array.length; i++) {
        System.out.println("Element at index " + i + " is " + array[i]);
}
}

public static void main(String[] args) {
    int [] array = new int[5];
    input(array);
    print(array);
   
    System.out.println("Enter the target element");
    try (Scanner sc = new Scanner(System.in)) {
        int target = sc.nextInt();
        int count = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] == target){
                count++;

        }
        
}
System.out.println(count);
    }
}
}