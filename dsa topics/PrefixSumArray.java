import java.util.*;
public class PrefixSumArray{
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6};
        // using extra space 
        // int [] b = new int[a.length];
        // b[0] = a[0];
        // for(int i =1; i < a.length; i++){
        //     b[i]  = b[i-1] + a[i];
        // }


        // without using extra space
        //  for(int i =1; i < a.length; i++){
        //         a[i]  = a[i-1] + a[i];
        //     } 

        System.out.println("Prefix sum array is: ");
        for(int i =0 ; i< a.length; i++){
            System.out.println(a[i]);
        }
    }
}