import java.util.Scanner;

public class LastOccurance {
    

    public static void input (int [] array){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the element at index " + i);
            array[i] =   sc.nextInt();

    }
    sc.close();
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
    int index = 0;
    Scanner sc = new Scanner(System.in);
    int target = sc.nextInt();
    
    for(int i = 0; i< array.length; i++){
        if(array[i] == target){
            index = i;
        

    }
   
}
System.out.println(index);
sc.close();
}
}