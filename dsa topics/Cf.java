// import java.util.*;
// // import java.lang.*;
// public class Cf {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int [] a =new int[n];
//         for(int i =0; i<n; i++){
//             a[i]=sc.nextInt();
//         }
//         int sum = 0;
//         for(int i = 0; i < n; i++){
//             sum=sum+a[i];
//         }
//         System.out.println(Math.abs(sum));
//         sc.close();
//     }
// }

// import java.util.*;
// public class Cf {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int [] a =new int[n];
//         for(int i =0; i<n; i++){
//             a[i]=sc.nextInt();
//         }
//         int x = sc.nextInt();
//         for(int i = 0; i< n ;i++){

//         }
//         System.out.println(-1);
//                 return;

//     }
// }

// import java.util.*;
// public class Cf {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int [] a =new int[n];
//         for(int i =0; i<n; i++){
//             a[i]=sc.nextInt();
//         }
//        for(int i =0; i<n; i++){
//         if(a[i]<0){
//             a[i]=2;
//         }
//         if(a[i]>0){
//             a[i] =1;
//         }
//        }
//         for(int i =0; i<n; i++){
//             System.out.print(a[i]+" ");
//         }
//         sc.close();
//     }
// }

// import java.util.*;

// public class Cf {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int [] a =new int[n];
//         for(int i =0; i<n; i++){
//             a[i]=sc.nextInt();
//         }

//         for(int i = 0; i < n; i++){
//             if(a[i]<=10){
//                 System.out.println("A["+i+"]"+" "+"="+" "+a[i]);
//             }
//         }

//         sc.close();
//     }
// }

import java.util.*;

public class Cf {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();
        int a[][] = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (a[i][j] == x) {
                    System.out.println("will not take number");
                    return;
                }
            }
        }
        System.out.println("will take number");
        sc.close();
    }

}
