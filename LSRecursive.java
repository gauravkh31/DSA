import java.util.*;
public class LSRecursive {

    public static boolean ls(int [] a, int i, int target){
        if(i==a.length){
            return false;
        }

        if(a[i]!=target){
           return ls(a,i+1,target);
        }else{
        return true;
        }
        
        
    }

    public static void main(String[] args) {
        int a[] = {2,3,5,20,1};
        int n = a.length;
        boolean ans = ls(a,0,3);

        if(ans){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }
    }
    
}





//         below is using void recurive method  and above is using int recursive method

// import java.util.*;
// public class LSRecursive {

//     public static void ls(int [] a, int i, int target){
//         if(i==a.length){
//             System.out.println("not found");
//             return;
//         }

//         if(a[i]!=target){
//             ls(a,i+1,target);
//         }else{
//         System.out.println("found");
//         }
        
        
//     }

//     public static void main(String[] args) {
//         int a[] = {2,3,5,20,1};
//         int n = a.length;
//         ls(a,0,90);

//     }
    
// }

