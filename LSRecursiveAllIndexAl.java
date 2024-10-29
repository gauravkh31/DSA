

import java.util.*;
public class LSRecursiveAllIndexAl {
    public static ArrayList<Integer> ls(int [] a ,int idx,int target){
        if(idx==a.length){
          
            return new ArrayList<>();
        }

        ArrayList<Integer> al = new ArrayList<>();
        if(a[idx]==target){
            al.add(idx);
             
            
        }

        ArrayList<Integer> all = new ArrayList<>();
      all.addAll(ls(a,idx+1,target));
      return all;


            
        

    }




    public static void main(String[] args) {
        int a[] = {2,3,5,1,20,1};
        int n = a.length;
       ArrayList<Integer> al =  ls(a,0,1);
       System.out.println(al);


       

    }
    
}