// public class kk {
//     public static void print(int n){
//         if(n==1){
//             System.out.println(n);
//             return;
//         }
//         System.out.println(n);
//         print(n-1);
//     }
//     public static void main(String[] args) {
       
//             print(7);
        
        
//     }
    
// }






// public class kk {
//     public static void print(int n){
//         if(n==0){
//             // System.out.println(n);
//             return;
//         }
//         print(n-1);
//         System.out.println(n);
        
//     }
//     public static void main(String[] args) {
       
//             print(7);
        
        
//     }
    
// }







// public class kk {
//     public static int fact(int n){
//         if(n==1){
            
//             return 1;
//         }
//         return n*fact(n-1);
        
        
//     }
//     public static void main(String[] args) {
       
//             System.out.println(fact(5));
        
        
//     }
    
// }







// public class kk {
//     public static int sofdigit(int n){
//         // if(n<10){
            
//         //     return n;
//         // }
//         if(n/10<=0){
            
//             return n;
//         }
//         return n%10 + sofdigit(n/10);
        
        
//     }
//     public static void main(String[] args) {
       
//             System.out.println(sofdigit(5432));
        
        
//     }
    
// }






// public class kk {
//     public static int pofdigit(int n){
//         // if(n<10){
            
//         //     return n;
//         // }
//         if(n/10<=0){
            
//             return n;
//         }
//         return n%10 * pofdigit(n/10);
        
        
//     }
//     public static void main(String[] args) {
       
//             System.out.println(pofdigit(5432));
        
        
//     }
    
// }







public class kk {
    public static int reverse(int n){
        // if(n<10){
            
        //     return n;
        // }
        if(n/10==0){
            
            return n;
        }
        // int mul = 10*m;
        return reverse(n/10) + (n%10)*10;
        
        
    }
    public static void main(String[] args) {
       
            System.out.println(reverse(12345));
        
        
    }
    
}



