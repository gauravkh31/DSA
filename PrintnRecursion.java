// import java.util.*;
// public class PrintnRecursion {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter value of n: ");
//         int n = sc.nextInt();
//         print(n);
//     }
//      static void print(int n){
//         if(n==1){
//             System.out.println(1);
//             return;
//         }
//         print(n-1);
//         System.out.println(n);

//     }
    
// }
















import java.util.*;
public class PrintnRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        print(n);
    }
     static void print(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        print(n-1);
        
        

    }
    
}
