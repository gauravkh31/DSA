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
//         System.out.println(n);
//         print(n-1);
        
        

//     }
    
// }









import java.util.*;
public class PrintnRecursion {
    public static int add(int n, int sum){
        if(n==0){
            return sum;
        }
        return add(n-1,sum+n);
    }


    public static int addWOArg(int n){
        if(n==0){
            return 0;
        }


        int sum =n;
        return sum+addWOArg(n-1);
    }
    public static void main(String[] args) {
       System.out.println(add(5,0));
       System.out.println(addWOArg(5));
    }
     
    
}
