import java.util.*;
public class LSRecursiveAllIndex {
    public static void ls(int [] a ,int idx,int target){
        if(idx==a.length){
          
            return ;
        }
        if(a[idx]==target){
            System.out.print(idx+" ");
             
            
        }
        ls(a,idx+1,target);


            
        

    }




    public static void main(String[] args) {
        int a[] = {2,3,5,1,20,1};
        int n = a.length;
        ls(a,0,1);

    }
    
}