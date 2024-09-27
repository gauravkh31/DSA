// import java.util.*;
// public class crt2 {
//     public static void main(String[] args) {
//         int a[] = {1,2,3,4,5,6,7,8};
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter size of window: ");
//         int k = sc.nextInt();
       
//         int n = a.length;
//         int i = 0; 
//         int j = k;
//         int sum  =0;
//         for(int p = i; p <j ; p++){
//             sum = sum + a[p];
//         }
//         System.out.println(sum);
       
//         while(j < n){
           
           
           
//             sum=sum+a[j]-a[i];
//             j++;
//             i++;
          
//             System.out.println(sum);
            

//         }
//     }
// }



// import java.util.*;
// public class crt2 {
//     public static void main(String[] args) {
//         int a[] = {1,2,3,4,5,6,7,8};
//         Scanner sc = new Scanner(System.in);
//         // System.out.println("Enter size of window: ");
//         // int k = sc.nextInt();
       
//         // int n = a.length;
//         // int i = 0; 
//         // int j = k-1;
//         // int sum  =0;
//         // for(int p = i; p <=j ; p++){
//         //     sum = sum + a[p];
//         // }
//         // System.out.println(sum);
       
//         // while(j < n){
           
           
           
//         //     sum=sum+a[j++]-a[i++];
          
//         //     System.out.println(sum);
            

//         // }
//         int n = 
//         for(int i = 0; i < n; i++){
//             for
//         }



//     }
// }




// import java.util.*;
// public class crt2 {
//     public static void main(String[] args) {
//         String s = "abbccdzhaacd";
//         Scanner sc = new Scanner(System.in);
//         int n = s.length();
//         Set set = new HashSet();
//        for(int i =0; i < n; i++){
//         char k = s.charAt(i);
//         set.add(k);
//        }
//         System.out.println(set);
//       System.out.println(set.size());
//     }
// }

import java.util.*;
public class crt2 {
    public static void main(String[] args) {
       int [] a = {1,2,3,-1,4,-2,-6};
       for(int i = 0; i < a.length; i++){
        for(int j = i; j < a.length; i++)
        {
            for(int k =i ; k<j; k++){
                System.err.print(a[k]);
            }
        }
       }
    }
}

